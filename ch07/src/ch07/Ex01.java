package ch07;
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
//	public Product() {	} // 생성자가 없으면 자바 커파일러가 default 생성자를 만들어 준다
	Product(int price) {  // 생성자가 하나라도 있으면 default생성자를 안 만들어 준다
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}
class Tv extends Product {
	Tv() {	
		super(100);  // 매개변수를 전수를 가진 생성자 호출
	} // default 생성자를 가진 부모를 호출하는 데 부모가 default생성자 없어서 에러
	public String toString() {
		return "Tv";
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}