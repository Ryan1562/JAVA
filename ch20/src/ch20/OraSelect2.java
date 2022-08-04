package ch20;
import java.sql.*;
import java.util.Scanner;
public class OraSelect2 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 부서코드를 입력하세요");
		int deptno = sc.nextInt();
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; Statement stmt = null;   ResultSet rs = null;  
		String sql = "select * from dept where deptno="+deptno;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("부서코드 : "+rs.getInt(1));
				System.out.println("부서명 : "+rs.getString(2));
				System.out.println("근무지 : "+rs.getString(3));
			} else System.out.println("없는 부서입니다");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			rs.close(); stmt.close(); conn.close();
		}
		sc.close();
	}
}
