package customer;
import java.sql.*;
public class CustomerDaoImpl {  // DAO(Data Access Object)
	private static Connection conn = null;
	public Connection getConnection() { // DB 연결하는 메서드
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
		}catch (Exception e) {
			System.out.println("연결에러 : "+e.getMessage());
		}
		return conn;
	}
	
}