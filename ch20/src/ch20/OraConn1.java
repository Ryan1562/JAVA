package ch20;
import java.sql.Connection;
import java.sql.DriverManager;
public class OraConn1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);  // driver load
			// db연결
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("연결 성공 ㅋㅋ");
			conn.close(); // 연결 종료
		}catch (Exception e) {
			System.out.println("연결실패 : "+e.getMessage());
		}
	}
}