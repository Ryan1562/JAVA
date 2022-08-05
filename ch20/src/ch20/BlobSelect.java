package ch20;
import java.io.*;
import java.sql.*;
public class BlobSelect {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select photo from test where id='a1'";
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rs = null;
		try{
			File file = new File("kk.jpg");
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Blob blob = rs.getBlob("photo");
				InputStream is = blob.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buffer = new byte[1024];
				int i = 0; // -1은 더이상 읽을 데이터가 없다
				while((i = is.read(buffer)) != -1) {
					fos.write(buffer, 0, i);
				}
				is.close(); fos.close();
				System.out.println("그림 파일 출력 성공");
			} else System.out.println("그림이 없네");
		}catch (Exception e) { System.out.println(e.getMessage());
		}finally {	rs.close();  pstmt.close(); conn.close();	}
	}
}