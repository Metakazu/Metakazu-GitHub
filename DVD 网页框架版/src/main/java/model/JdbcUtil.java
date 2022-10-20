package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class JdbcUtil {
	public static Connection connect() throws SQLException {
		// 取得驱动
		Driver driver = new Driver();

		// 取得连接
		// ホスト名：localhost、ポート番号：3306、データベース：mysql
		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&characterEncoding=UTF-8";

		// ユーザーID：root、パスワード：brightstar
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "brightstar");

		return driver.connect(url, properties);
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		// 关闭连接
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
