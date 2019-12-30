package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert extends wininsert {

	public static void insert(String Num, String Name, String Age, String Sex, String SelectedIndex) {
		String sql_url = "jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Student"; // 数据库路径（一般都是这样写），test是数据库名称
		String name = "sa"; // 用户名
		String password = "wu123456"; // 密码
		Connection conn;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // 连接驱动
			conn = DriverManager.getConnection(sql_url, name, password); // 连接数据库
			preparedStatement = conn.prepareStatement("insert into Student (学号,姓名,年龄,性别,院系) values ('" + Num + "','"
					+ Name + "','" + Age + "','" + Sex + "','" + SelectedIndex + "')");
			ResultSet result1 = preparedStatement.executeQuery();
			if (result1.wasNull())
				JOptionPane.showMessageDialog(null, "结果集中无记录");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
}

