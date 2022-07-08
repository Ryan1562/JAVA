package ch07;
public class FruitBuyer3 {
	String name;
	int numOfApple;
	int money;
	public FruitBuyer3(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
//	               선언 : 판매자가 여러명 가능
	void buyApple(FruitSeller3 fs, int amt) { // amt : 사과 구매할 돈
		if (money < amt) System.out.println("돈이 부족해서 못 사겠네 ㅠㅠ");
		else {
			int num = fs.saleApple(amt); // 구매한 사과 갯수
			if (num != 0) { // 사과 구매 성공
				numOfApple += num;
				money -= amt;
				System.out.printf("%s 사과 득템 %d개, 지출 %d원\n", name, num, amt);
			} else System.out.println("사과를 못 샀습니다");	 // 판매자가 사과가 부족한 경우
		}
	}
	void print() {
		System.out.println(name+"의 사과갯수 : " + numOfApple);
		System.out.println(name+"의 현금잔액 : " +money);
		System.out.println("===============");
	}
}
