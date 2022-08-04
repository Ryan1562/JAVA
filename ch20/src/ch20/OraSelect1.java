package ch20;
import java.sql.*;
public class OraSelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;  // 연결할 객체
		Statement stmt = null;   // Sql실행할 객체
		ResultSet rs = null;     // 결과를 저장할 객체
		String sql = "select * from dept";
		try {
			Class.forName(driver); // driver load
			conn = DriverManager.getConnection(url,"scott","tiger"); // DB연결
			stmt = conn.createStatement();  // 연결된 DB에서 sql실행할 객체 생성
			rs = stmt.executeQuery(sql);    // sql을 실행하고 그 결과를 rs에 저장
			while(rs.next()) {
				System.out.println("부서코드 : "+rs.getInt("deptno"));  // rs.getInt(1);
				System.out.println("부서명 : "+rs.getString("dname")); // rs.getString(2);
				System.out.println("근무지 : "+rs.getString("loc"));   // rs.getString(3);
				System.out.println("=================");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());  // 에러 출력
		}finally {
			rs.close();  stmt.close();  conn.close();
		}
	}
}