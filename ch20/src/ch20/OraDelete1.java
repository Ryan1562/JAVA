package ch20;
import java.sql.*;
import java.util.Scanner;
public class OraDelete1 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드");
		int deptno = sc.nextInt();
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "delete from dept where deptno=?";
		Connection conn = null;  PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("삭제 됐네");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {	pstmt.close();  conn.close();		}
		sc.close();
	}
}