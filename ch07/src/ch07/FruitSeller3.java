package ch07;
public class FruitSeller3 {
	String name;	int numOfApple;	int money;
	final int PRICE_PER_APPLE = 1000; // 종단변수, 값을 변경 금지, 대문자 사용	
	public FruitSeller3(String name, int numOfApple, int money) { // 초기화
		this.name = name; this.numOfApple = numOfApple; this.money = money;
	}	
	int saleApple(int amt) { // amt : 사과 사는 사람에게 받은 돈		
		int num = amt / PRICE_PER_APPLE; // 판매한 사과 갯수
		if (numOfApple >= num) { // 주문한 수량이 남아있는 사과의 수량과 같거나 적으면
			numOfApple -= num;
			money += amt;
			System.out.printf("%s %d개 판매, 수입 %d원\n",name,num, amt);
		} else {
			System.out.println("사과가 부족해서 팔 수 없습니다");
			num = 0; // 안 팔았다
		}		
		return num;
	}
	void print() {
		System.out.println(name+"의 사과갯수 : " + numOfApple);
		System.out.println(name+"의 현금잔액 : " +money);
		System.out.println("===========");
	}
}