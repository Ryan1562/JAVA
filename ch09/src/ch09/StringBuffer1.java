package ch09;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		                  글자       글자의 길이     메모리 확보된 용량
		System.out.println(sb+"/"+sb.length()+"/"+sb.capacity());
		sb.append("누구든지 사랑하기 위해선");
		System.out.println(sb+"/"+sb.length()+"/"+sb.capacity());
		sb.append("남들을 증오 할 때도 있었어");
		System.out.println(sb+"/"+sb.length()+"/"+sb.capacity());
		System.out.println(sb.reverse());
	}
}
