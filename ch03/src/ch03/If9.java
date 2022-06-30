package ch03;

public class If9 {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		String msg = "";
		if (value < 10) msg = "10미만";
		else if (value < 100) msg = "10이상 100미만";
		else if (value < 1000) msg = "100이상 1000미만";
		else msg = "1000이상";
		System.out.printf("입력한 값은 %d이고 경과는 %s입니다",value, msg);
	}
}
