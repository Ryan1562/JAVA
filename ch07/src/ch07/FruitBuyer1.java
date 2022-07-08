package ch07;
public class FruitBuyer1 {
	int numOfApple = 0;
	int money = 5000;
//	               선언 : 판매자가 여러명 가능
	void buyApple(FruitSeller1 fs1, int amt) { // amt : 사과 구매할 돈
		int num = fs1.saleApple(amt); // 구매한 사과 갯수
		numOfApple += num;
		money -= amt;
	}
	void print() {
		System.out.println("구매자 사과 갯수 : " + numOfApple);
		System.out.println("구매자의 현금잔액 : " +money);
		System.out.println("===============");
	}
}
