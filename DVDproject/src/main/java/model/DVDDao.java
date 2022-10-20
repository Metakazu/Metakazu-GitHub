package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DVDDao {
	//DAO 是数据访问类
	// 新增DVD
	public static String addDVD(String dvdName) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection connection = null;

		try {
			connection = JdbcUtil.connect();

			String sql = "insert into datebase.DVD(name) values (?)";
			ps = connection.prepareStatement(sql);
			ps.setString(1, dvdName);//(1, DVDname)1=何番目の?
			//更新系
			ps.executeUpdate();// ps.executeUpdate();→執行
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, ps, rs);
		}
		return dvdName;
	}

	//查看DVD
	public static List<DVD> viewDVD(int state) {
		List<DVD> dvds = new ArrayList<>();

		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection connection = null;

		try {
			connection = JdbcUtil.connect();
			//	String sql="insert into DVD(name) values (?)";
			//	  //予編訳 PreparedStatement：動態
			//	  //編訳しながら執行 Statement：静態
			//	  PreparedStatement ps = connection.prepareStatement(sql);
			//	  String DVDname= new java.util.Scanner(System.in).nextLine();
			//	  ps.setString(1, DVDname);//(1, DVDname)1=何番目の?
			//	  int result = ps.executeUpdate();// ps.executeUpdate();→執行
			//	  System.out.println(result>0? "Success":"Fail");
			//	  
			//	  //クローズ連接
			//	  ps.close();
			//	  connection.close();
			//-----------------------------------------------------------------
			//System.out.println("3.執行SQL（查迿系）");
			//1.取得SQL
			//			StringBuilder sb = new StringBuilder();
			//			sb.append(" select d.ID,DVD_state,name,lend_date,count ");
			//			sb.append(" from datebase.DVD d ");
			//			sb.append(" left join datebase.DVD_Record r ");
			//			sb.append(" on d.ID=r.ID ");
			//			sb.append(" and r.return_date is null");
			//			sb.append(" where delete_flag = 0 ");
			//			sb.append(" order by d.ID");

			String sql = "select * from datebase.DVD_view";
			if (state == 0 || state == 1) {
				sql += " where DVD_State = " + state;
			}

			//創建PreparedStatement対象
			//ps = connection.prepareStatement(sb.toString());
			ps = connection.prepareStatement(sql);

			//執行
			rs = ps.executeQuery();

			//.next()判断次の結果あるかどうか
			while (rs.next()) {
				DVD dvd = new DVD();
				dvd.setID(rs.getInt("ID"));
				dvd.setName(rs.getString("NAME"));
				dvd.setState(rs.getInt("DVD_State"));
				dvd.setDate(rs.getDate("lend_date"));
				dvd.setCount(rs.getInt("Count"));
				rs.getInt("ID");//ID:Mysqlの列

				dvds.add(dvd);
			}

			for (DVD dvd : dvds) {
				System.out.println(dvd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, ps, rs);
		}
		return dvds;
	}

	//获取DVD状态信息
	public static DVD selectDVDById(int id) {
		DVD dvd = new DVD();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "SELECT DVD_STATE, NAME, DELETE_FLAG FROM datebase.DVD WHERE ID = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				dvd.setState(rs.getInt("DVD_STATE"));
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

	//删除DVD
	public static int deleteDVD(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "UPDATE datebase.DVD SET DELETE_FLAG = 1 WHERE ID = ? AND DVD_STATE = 1 AND DELETE_FLAG = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return id;
	}

	//借出DVD
	public static void lendDVD(int id) {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "update datebase.DVD set DVD_state = 0, count=count+1,last_update_time = current_timestamp where id = ? and DVD_state = 1 and delete_flag = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();

			String sql2 = "insert into datebase.DVD_Record(ID,lend_date) values (?,current_date);";
			ps = conn.prepareStatement(sql2);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
	}

	// 借出DVD（事务）
	//	public static void lendDVDTransaction(int id) throws SQLException {
	//		Connection conn = null;
	//		PreparedStatement ps = null;
	//
	//		try {
	//			conn = JdbcUtil.connect();
	//
	//			// 取消数据库的自动提交
	//			conn.setAutoCommit(false);
	//
	//			String sql = "UPDATE DVD SET STATE_ = 0, COUNT = COUNT + 1, LAST_UPDATE_TIME = CURRENT_TIMESTAMP WHERE ID = ? AND STATE_ = 1 AND DELETE_FLAG = 0";
	//			ps = conn.prepareStatement(sql);
	//			ps.setInt(1, id);
	//			ps.executeUpdate();
	//
	//			String sql2 = "INSERT INTO DVD_RECORD(ID, LEND_DATE) VALUES (?, CURRENT_DATE)";
	//			ps = conn.prepareStatement(sql2);
	//			ps.setInt(1, id);
	//			ps.executeUpdate();
	//
	//			// 当所有SQL执行完，手动提交
	//			conn.commit();
	//		} catch (SQLException e) {
	//			// 当SQL执行发生异常时，进行回滚
	//			conn.rollback();
	//			e.printStackTrace();
	//		} finally {
	//			// 恢复数据库的自动提交
	//			conn.setAutoCommit(true);
	//			JdbcUtil.close(conn, ps, null);
	//		}
	//	}

	// 借出DVD（存储过程）
	//	public static void lendDVD2(int id) throws SQLException {
	//		Connection conn = null;
	//		CallableStatement cs = null;
	//
	//		try {
	//			conn = JdbcUtil.connect();
	//			//存储过程
	//			String sql = "CALL SP_LEND_DVD(?)";
	//			cs = conn.prepareCall(sql);
	//			cs.setInt(1, id);
	//			cs.executeUpdate();
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			JdbcUtil.close(conn, cs, null);
	//		}
	//	}

	//归还DVD
	public static void returnDVD(int id) {
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "update datebase.DVD set DVD_state = 1,last_update_time = current_date where id = ? and DVD_state = 0 and delete_flag = 0";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();

			StringBuilder sb2 = new StringBuilder();
			//计算cost费用
			sb2.append(" update datebase.DVD_Record");
			sb2.append(" set return_date=current_date,");
			sb2.append(" cost = case ");
			sb2.append(" when datediff(return_date,lend_date)=0 then 1");
			sb2.append(" else datediff(return_date,lend_date)*price");
			sb2.append(" end,");
			sb2.append(" Last_update_time=current_timestamp");
			sb2.append(" where ID=?");
			sb2.append(" and return_date is null;");
			ps = conn.prepareStatement(sb2.toString());
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
	}

	//取出费用 展示
	//	public static DVD cost(int id) {
	//		ResultSet rs = null;
	//		Connection conn = null;
	//		PreparedStatement ps = null;
	//
	//		DVD dvd = new DVD();
	//
	//		try {
	//			conn = JdbcUtil.connect();
	//
	//			StringBuilder sb2 = new StringBuilder();
	//			//创建新join的表 将cost拿出来
	//			sb2.append(" SELECT r.cost");
	//			sb2.append(" from datebase.DVD as d ");
	//			sb2.append(" join datebase.DVD_Record as r");
	//			sb2.append(" on d.ID=r.ID");
	//			sb2.append(" where d.ID=?");
	//			//只显示最新的数据 降序排序
	//			sb2.append(" order by r.last_update_time desc limit 1");
	//
	//			ps = conn.prepareStatement(sb2.toString());
	//			ps.setInt(1, id);
	//			//查询系
	//			rs = ps.executeQuery();
	//
	//			while (rs.next()) {
	//				dvd.setCost(rs.getInt("cost"));
	//			}
	//
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			JdbcUtil.close(conn, ps, rs);
	//		}
	//		return dvd;
	//
	//	}

	public static DVD selectCostById(int id) {
		//		int cost = 0;

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		DVD dvd = new DVD();

		try {
			conn = JdbcUtil.connect();

			String sql = "SELECT COST FROM datebase.DVD_RECORD WHERE ID = ? ORDER BY LAST_UPDATE_TIME  LIMIT 1";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			//			if (rs.next()) {
			//				cost = rs.getInt("COST");
			//			}
			while (rs.next()) {
				dvd.setCost(rs.getInt("cost"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}

		return dvd;
	}



}