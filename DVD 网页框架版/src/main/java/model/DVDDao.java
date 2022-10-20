package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class DVDDao {
	// 新增DVD
	public static void addDVD(String dvdName) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "INSERT INTO DVD(NAME) VALUE (?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dvdName);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, null);
		}
	}

	// 查看DVD
	// 0920新增参数int state作用：通过state进行判断从而取得不同的DVD集合
	// 当state为-1时，不执行新增的where条件，此时取得所有DVD（和原来一样）
	// 当state为1时，执行新增的where条件，此时取得所有可借出可删除DVD（原来的一部分）
	// 当state为0时，执行新增的where条件，此时取得所有已借出DVD（原来的一部分）
	public static List<DVD> viewDVD(int state) {
		List<DVD> dvds = new ArrayList<>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			// 执行SQL（查询系）
			// 1.取得SQL
			//			StringBuilder sb = new StringBuilder();
			//			sb.append(" SELECT ");
			//			sb.append("	    d.ID ");
			//			sb.append("	    , STATE_ ");
			//			sb.append("	    , NAME ");
			//			sb.append("	    , LEND_DATE ");
			//			sb.append("	    , COUNT ");
			//			sb.append(" FROM ");
			//			sb.append("	      DVD d ");
			//			sb.append(" LEFT JOIN DVD_RECORD r ");
			//			sb.append("        ON d.ID = r.ID ");
			//			sb.append("        AND r.RETURN_DATE IS NULL ");
			//			sb.append(" WHERE ");
			//			sb.append("        DELETE_FLAG = 0 ");
			//			sb.append(" ORDER BY ");
			//			sb.append("        d.ID ");
			String sql = "SELECT * FROM DVD_VIEW";
			if (state == 0 || state == 1) {
				sql += " WHERE STATE_ = " + state;
			}

			// 2.创建PreparedStatement对象
			//			ps = conn.prepareStatement(sb.toString());
			ps = conn.prepareStatement(sql);

			// 3.执行SQL&取得结果
			rs = ps.executeQuery();

			while (rs.next()) {
				DVD dvd = new DVD();

				dvd.setId(rs.getInt("ID"));
				dvd.setName(rs.getString("NAME"));
				dvd.setState(rs.getInt("STATE_"));
				dvd.setDate(rs.getDate("LEND_DATE"));
				dvd.setCount(rs.getInt("COUNT"));

				dvds.add(dvd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}

		return dvds;
	}

	// 通过ID取得DVD进行状态判断
	public static DVD selectDVDById(int id) {
		DVD dvd = new DVD();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "SELECT STATE_, NAME, DELETE_FLAG FROM DVD WHERE ID = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				dvd.setState(rs.getInt("STATE_"));
				dvd.setName(rs.getString("NAME"));
				dvd.setDeleteFlag(rs.getInt("DELETE_FLAG"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}

		return dvd;
	}

	// 删除DVD
	public static void deleteDVD(int id) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "UPDATE DVD SET DELETE_FLAG = 1 WHERE ID = ? AND STATE_ = 1 AND DELETE_FLAG = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, null);
		}
	}

	// 借出DVD（事务）
	public static void lendDVDTransaction(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			// 取消数据库的自动提交
			conn.setAutoCommit(false);

			String sql = "UPDATE DVD SET STATE_ = 0, COUNT = COUNT + 1, LAST_UPDATE_TIME = CURRENT_TIMESTAMP WHERE ID = ? AND STATE_ = 1 AND DELETE_FLAG = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();

			String sql2 = "INSERT INTO DVD_RECORD(ID, LEND_DATE) VALUES (?, CURRENT_DATE)";
			ps = conn.prepareStatement(sql2);
			ps.setInt(1, id);
			ps.executeUpdate();

			// 当所有SQL执行完，手动提交
			conn.commit();
		} catch (SQLException e) {
			// 当SQL执行发生异常时，进行回滚
			conn.rollback();
			e.printStackTrace();
		} finally {
			// 恢复数据库的自动提交
			conn.setAutoCommit(true);
			JdbcUtil.close(conn, ps, null);
		}
	}

	// 借出DVD（存储过程）
	public static void lendDVD(int id) {
		Connection conn = null;
		CallableStatement cs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "CALL SP_LEND_DVD(?)";
			cs = conn.prepareCall(sql);
			cs.setInt(1, id);
			cs.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, cs, null);
		}
	}

	// 归还DVD（事务）
	public static void returnDVDTransaction(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			// 取消数据库的自动提交
			conn.setAutoCommit(false);

			String sql = "UPDATE DVD SET STATE_ = 1, LAST_UPDATE_TIME = CURRENT_TIMESTAMP WHERE ID = ? AND STATE_ = 0 AND DELETE_FLAG = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();

			String sql2 = "UPDATE DVD_RECORD SET RETURN_DATE = CURRENT_DATE, COST = IF (DATEDIFF(CURRENT_DATE, LEND_DATE) = 0, 1, DATEDIFF(CURRENT_DATE, LEND_DATE) * PRICE), LAST_UPDATE_TIME = CURRENT_TIMESTAMP WHERE ID = ? AND RETURN_DATE IS NULL";
			ps = conn.prepareStatement(sql2);
			ps.setInt(1, id);
			ps.executeUpdate();

			// 当所有SQL执行完，手动提交
			conn.commit();
		} catch (SQLException e) {
			// 当SQL执行发生异常时，进行回滚
			conn.rollback();
			e.printStackTrace();
		} finally {
			// 恢复数据库的自动提交
			conn.setAutoCommit(true);
			JdbcUtil.close(conn, ps, null);
		}
	}

	// 通过ID取得最新借出记录的花费金额
	public static int selectCostById(int id) {
		int cost = 0;

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "SELECT COST FROM DVD_RECORD WHERE ID = ? ORDER BY LAST_UPDATE_TIME DESC LIMIT 1";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				cost = rs.getInt("COST");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}

		return cost;
	}

	// 归还DVD（存储过程）
	public static int returnDVD(int id) {
		int cost = 0;

		Connection conn = null;
		CallableStatement cs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "CALL SP_RETURN_DVD(?,?)";
			cs = conn.prepareCall(sql);
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.INTEGER);
			cs.execute();

			cost = cs.getInt("DVD_COST");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, cs, null);
		}

		return cost;
	}
}
