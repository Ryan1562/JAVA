package ch20;
import java.sql.*;
import java.util.Scanner;
public class OraInsert1 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명을 입력하세요");
		String dname = sc.nextLine();
		System.out.println("근무지를 입력하세요");
		String loc = sc.nextLine();
 		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; Statement stmt = null;   
//		String sql = "insert into dept values ("+deptno+",'"+dname+"','"+loc+"')";
		String sql = String.format("insert into dept values (%d,'%s','%s')", deptno,dname,loc);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("입력 성공 ㅋㅋ");
		}catch (Exception e) {	System.out.println(e.getMessage());
		}finally {	stmt.close();  conn.close();		}
		sc.close();
	}
}