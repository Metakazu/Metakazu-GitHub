package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DVDhistoryDao {
	public static List<DVDhistory> getHistoryById(int id) {
		List<DVD> history = new ArrayList<>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.connect();

			String sql = "SELECT lend_date,return_date,cost FROM datebase.DVD_Record where ID=1 order by create_time; ";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {

				history.setCost(rs.getInt("cost"));

				history.setDate(rs.getDate("lend_date"));
				history.setReturndate(rs.getDate("return_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}

		return ;

	}
}
