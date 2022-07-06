package ch06;
public class Return3 {
	public static void main(String[] args) {
		String[] name = {"은우", "준오", "로제", "제니", "하니"};
		for(int i = 0; i < name.length;i++) {
			String msg = call(name[i], i);
			System.out.println(msg);
		}
	}
	static String call(String name, int i) {
		String[] hello = {"안녕하세요","hello","사우드 캅", "봉주르","구텐모르겐"};
		return name+"님 "+hello[i];
	}
}