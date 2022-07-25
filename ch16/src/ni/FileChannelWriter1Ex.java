package ni;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileChannelWriter1Ex {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		String data = "안녕하세요";
		Charset charset = Charset.defaultCharset();
		ByteBuffer bf = charset.encode(data);  
		int byteCount = fc.write(bf);
		System.out.println(byteCount+"문자 저장");  // 15 = 5 * 3(초(자음),중(모음),종(받침))
		fc.close();
	}
}