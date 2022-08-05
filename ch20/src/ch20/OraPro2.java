package ch20;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
public class OraPro2 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사번");	int empno = Integer.parseInt(sc.nextLine());
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "{call emp_info(?,?,?)";
		Connection conn = null;  CallableStatement cs = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, empno);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute();
			System.out.println("이름 : "+cs.getString(2));
			System.out.println("급여 : "+cs.getInt(3));
		}catch (Exception e) {  System.out.println(e.getMessage());
		}finally {	cs.close();  conn.close();		}
		sc.close();
	}
}
