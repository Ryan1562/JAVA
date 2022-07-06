package ch06;
public class Fat1 {
	public static void main(String[] args) {
		int[] num = { 3, 4, 5, 6};
		for(int i = 0; i < num.length;i++) {
			System.out.print(num[i]+"계승 : ");
			System.out.println(fat(num[i]));
		}
		System.out.println("===============");
		for(int n : num) {
			System.out.print(n+"계승 : ");
			System.out.println(fat2(n));
		}
	}
	static int fat(int num) {
		int result = 1;
		for(int i = num;i > 0; i-- ) { // 
			result *= i; // result = result * i; 6 * 5
		}
		return result;
	}
	static int fat2(int num) { // recursive(반복) 함수, 주의사항은 매개변수 값을 계속 변경해야 한다
		if (num == 1) return 1;
		else return num * fat2(--num); // 3 * fat2(2) => 3 * 2 * fat2(1) => 3 * 2 * 1
	}   //    6 * fat2(5) => 6 * 5 * fat2(4) => 6 * 5 * 4 * fat2(3) => 6 * 5 * 4 *  3 * fat2(2)        
}       //    6 * 5 8 4 * 3 * 2 * fat2(1) =>  6 * 5 * 4 * 3 * 2 * 1 => 720



