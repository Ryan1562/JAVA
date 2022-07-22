package ch16;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class IOEx1 {
	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;  
		// read() 바이트 단위로 읽기, -1은 더이상 읽을 데이터가 없음
		while((data = input.read()) != -1) {
			output.write(data);
		}
		outSrc = output.toByteArray(); // output에 있는 데이터를 outSrc에 byte배열로 넣는다
		input.close();  output.close();
		System.out.println("inSrc : "+Arrays.toString(inSrc));
		System.out.println("outSrc : "+Arrays.toString(outSrc));
	}
}