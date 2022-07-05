package ch05;
class Card {
	String kind;  // 스페이드, 하트, 다이어몬드, 클로바
	int number;   // 1 ~ 13
	static int width, height; // static 클래스 변수 
	void print() {
		System.out.println("종류 : " + kind);
		System.out.println("번호 : " + number);
		System.out.println("가로 : " + width);
		System.out.println("세료 : " + height);
		System.out.println("==================");
	}
}
public class CardEx {
	public static void main(String[] args) {
		Card.width = 100; Card.height = 250;
		Card card1 = new Card(); Card card2 = new Card(); Card card3 = new Card(); 
		card1.kind = "스페이드"; card1.number = 7;
		card2.kind = "하트"; card2.number = 1;
		card3.kind = "클로바"; card3.number = 10;
		card1.print(); card2.print(); card3.print();
	}
}