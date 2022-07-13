package ch09;
public class Math1 {
	public static void main(String[] args) {
		double d1=4.1, d2=4.7, d3=-4.1, d4=-4.7;
// round : 반올림 4작으면 버리고 5이상이면 올림
// ceil(천장)  : 현재 숫자 이상인 정수 중에서 가장 작은 수 
// floor(마루) :      "  이하인         "    큰수		
		System.out.println("r d1 = "+Math.round(d1));
		System.out.println("r d2 = "+Math.round(d2));
		System.out.println("r d3 = "+Math.round(d3));
		System.out.println("r d4 = "+Math.round(d4));
		System.out.println("===================");
		System.out.println("c d1 = "+Math.ceil(d1));
		System.out.println("c d2 = "+Math.ceil(d2));
		System.out.println("c d3 = "+Math.ceil(d3));
		System.out.println("c d4 = "+Math.ceil(d4));
		System.out.println("===================");
		System.out.println("f d1 = "+Math.floor(d1));
		System.out.println("f d2 = "+Math.floor(d2));
		System.out.println("f d3 = "+Math.floor(d3));
		System.out.println("f d4 = "+Math.floor(d4));
	}
}
