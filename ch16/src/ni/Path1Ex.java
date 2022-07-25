package ni;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Path1Ex {
	public static void main(String[] args) {
//		Path path = Paths.get("src/ni/Path1Ex.java");
		Path path = Paths.get("src/ch16/Dir1Ex.java");
		System.out.println("패키지명 : "+path.getParent().getFileName());
		for(int i = 0; i <path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
}