package ch10;

public class NullExcept {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data);
//		값이 없는데 어떻게 문자로 바꾸지, 없는 값을 처리할 때 발생
		System.out.println(data.toString());
	}
}
