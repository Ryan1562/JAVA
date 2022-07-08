package ch07;
public class FruitBuyer2 {
	String name;
	int numOfApple;
	int money;
	public FruitBuyer2(String name, int numOfApple, int money) {
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}
//	               선언 : 판매자가 여러명 가능
	void buyApple(FruitSeller2 fs1, int amt) { // amt : 사과 구매할 돈
		int num = fs1.saleApple(amt); // 구매한 사과 갯수
		numOfApple += num;
		money -= amt;
	}
	void print() {
		System.out.println(name+"의 사과갯수 : " + numOfApple);
		System.out.println(name+"의 현금잔액 : " +money);
		System.out.println("===============");
	}
}
