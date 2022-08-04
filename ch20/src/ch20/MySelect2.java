package ch20;
import java.sql.*;
import java.util.Scanner;
public class MySelect2 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 사원의 사번을 입력하시오");
		int empno = sc.nextInt();
		String driver = "com.mysql.cj.jdbc.Driver";  // 8.0대 mysql
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = 
		   "select empno, ename,job,dname from emp e, dept d where e.deptno=d.deptno and empno="+empno;
//		사번을 받아서 mysql에서 emp, dept 테이블에서 사번, 이름, 업무, 부서명 없으면 없는 사원입니다
		Connection conn = null; Statement stmt = null; ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("사번 : "+rs.getInt("empno"));
				System.out.println("이름 : "+rs.getString("ename"));
				System.out.println("업무 : "+rs.getString("job"));
				System.out.println("부서명 : "+rs.getString("dname"));
			} else System.out.println("없는 사원입니다");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {
			rs.close(); stmt.close(); conn.close();
		}
		sc.close();
	}
}