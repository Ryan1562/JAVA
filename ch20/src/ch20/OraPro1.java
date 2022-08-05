package ch20;
import java.sql.*;
import java.util.Scanner;
public class OraPro1 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서코드");	int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 부서명");	String dname = sc.nextLine();
		System.out.println("수정할 근무지");	String loc = sc.nextLine();
		String sql = "{call update_dept(?,?,?)}";
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;  CallableStatement cs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott","tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, deptno);  cs.setString(2, dname); cs.setString(3, loc);
			int result = cs.executeUpdate();
			if (result > 0) System.out.println("수정 성공 ㅋㅋ");
			else System.out.println("수정 실패 ㅠㅠ");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {	cs.close();  conn.close();		}
		sc.close();
	}
}