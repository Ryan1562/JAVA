package ch20;
import java.sql.*;
import java.util.Scanner;
public class MyUpdate1 {
	public static void main(String[] args) throws SQLException {
		// emp테이블에 사번에 해당하는 이름과 업무를 수정 PrepareStaement를 이용하여 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 사번을 입력하세요"); int empno = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 이름을 입력하세요"); String ename = sc.nextLine();
		System.out.println("수정할 업무를 입력하세요"); String job = sc.nextLine();
		String driver = "com.mysql.cj.jdbc.Driver";  // 8.0대 mysql
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = "update emp set ename=?,job=? where empno=?";
		Connection conn = null;   PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			pstmt  = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, empno);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("수정 성공 ㅋㅋ");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {
			pstmt.close();  conn.close();
		}
		sc.close();
	}
}