package ch07;
public class FruitSeller2 {
	String name;
	int numOfApple;
	int money;
	final int PRICE_PER_APPLE = 1000; // 종단변수, 값을 변경 금지, 대문자 사용
	
	public FruitSeller2(String name, int numOfApple, int money) { // 초기화
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}	
	int saleApple(int amt) { // amt : 사과 사는 사람에게 받은 돈
		money += amt;
		int num = amt / PRICE_PER_APPLE; // 판매한 사과 갯수
		numOfApple -= num;
		return num;
	}
	void print() {
		System.out.println(name+"의 사과갯수 : " + numOfApple);
		System.out.println(name+"의 현금잔액 : " +money);
		System.out.println("===========");
	}
}