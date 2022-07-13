package ch09;

public class System1 {
	public static void main(String[] args) {
//		시스템의 설정파일을 읽을 때 사용
		String path = System.getenv("path");
		System.out.println(path);
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(java_home);
		System.out.println(System.currentTimeMillis());
	}
}
