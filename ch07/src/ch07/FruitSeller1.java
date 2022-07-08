package ch07;
public class FruitSeller1 {
	int numOfApple = 20;
	int money = 0;
	final int PRICE_PER_APPLE = 1000; // 종단변수, 값을 변경 금지, 대문자 사용
	int saleApple(int amt) { // amt : 사과 사는 사람에게 받은 돈
		money += amt;
		int num = amt / PRICE_PER_APPLE; // 판매한 사과 갯수
		numOfApple -= num;
		return num;
	}
	void print() {
		System.out.println("판매자 사과 갯수 : " + numOfApple);
		System.out.println("판매자의 현금잔액 : " +money);
		System.out.println("===========");
	}
}