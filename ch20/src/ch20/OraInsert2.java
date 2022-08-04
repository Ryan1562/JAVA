package ch20;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class OraInsert2 {
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
		Connection conn = null; PreparedStatement pstmt = null;   
		String sql = "insert into dept values (?,?,?)";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql); // sql먼저 들어간다
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int result = pstmt.executeUpdate();  // sql이 없음
			if (result > 0) System.out.println("입력 성공 ㅋㅋ");
		}catch (Exception e) {	System.out.println(e.getMessage());
		}finally {	pstmt.close();  conn.close();		}
		sc.close();
	}
}