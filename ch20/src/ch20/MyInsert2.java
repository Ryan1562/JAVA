package ch20;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class MyInsert2 {
	public static void main(String[] args) throws SQLException {		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력 하세요"); int empno=Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력 하세요"); String ename =sc.nextLine();
		System.out.println("업무를 입력 하세요"); String job=sc.nextLine();
		System.out.println("급여를 입력 하세요"); int sal=Integer.parseInt(sc.nextLine());
		System.out.println("부서코드를 입력 하세요"); int deptno=Integer.parseInt(sc.nextLine());
		String driver = "com.mysql.cj.jdbc.Driver";  // 8.0대 mysql
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = "insert into emp (empno,ename,job,sal,deptno) values(?,?,?,?,?)";
		Connection conn = null; PreparedStatement pstmt = null;
		try{Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, sal);
			pstmt.setInt(5, deptno);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("입력 성공 대박");
		}catch (Exception e) {	System.out.println(e.getMessage());
		}finally {		pstmt.close();  conn.close();		}
		sc.close();
	}
}
