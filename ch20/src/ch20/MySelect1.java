package ch20;
import java.sql.*;
public class MySelect1 {
	public static void main(String[] args) throws SQLException {
		// Mysql DB에서 Emp을 읽어서 사번, 이름, 업무, 급여를 출력
		String driver = "com.mysql.cj.jdbc.Driver";  // 8.0대 mysql
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = "select empno,ename,job,sal from emp";
		Connection conn = null;		Statement stmt = null;		ResultSet rs = null;
		System.out.println("사번\t이름\t업무\t\t급여");
		System.out.println("=====================================");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
				if (rs.getString(3).length()  < 8)
					System.out.println("\t"+rs.getInt(4));
				else System.out.println(rs.getInt(4));
			}
			System.out.println("=====================================");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			rs.close(); stmt.close();  conn.close();
		}
	}
}