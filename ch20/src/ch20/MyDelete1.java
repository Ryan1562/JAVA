package ch20;
import java.sql.*;
import java.util.Scanner;
public class MyDelete1 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사번");
		int empno = sc.nextInt();
		String driver = "com.mysql.cj.jdbc.Driver";  // 8.0대 mysql
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = "delete from emp where empno="+empno;
		Connection conn = null; Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("삭제 성공");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {
			stmt.close();  conn.close();
		}
		sc.close();
	}
}