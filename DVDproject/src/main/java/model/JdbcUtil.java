package model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class JdbcUtil {
	//将下面的方法，抛给Test Main方法内去执行try catch
	public static Connection connect() throws SQLException {
		Driver driver = new Driver();
		//取得连接
		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false";//:表示具体的数据库名
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "enchouree");
		return driver.connect(url, properties);
	}

	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		//关闭的先后顺序
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
