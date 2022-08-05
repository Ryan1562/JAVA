package ch20;
import java.sql.*;
import java.util.Scanner;
public class OraUpdate {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		System.out.println("변경할 부서코드");
//		int deptno = sc.nextInt();
		String deptno = sc.nextLine();
		System.out.println("변경할 부서명");
		String dname = sc.nextLine();
		String sql = String.format("update dept set dname='%s' where deptno=%s",dname, deptno);
		Connection conn = null; Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("수정 성공");
		}catch (Exception e) { 	System.out.println(e.getMessage());
		}finally {
			stmt.close();  conn.close();
		}
		sc.close();
	}
}