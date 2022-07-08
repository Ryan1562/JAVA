package ch07;
public class FruitEx3 {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("로제", 30, 1000);
		FruitSeller3 fs2 = new FruitSeller3("제니", 20, 0);
		FruitBuyer3 fb1 = new FruitBuyer3("화사",0, 20000);
		FruitBuyer3 fb2 = new FruitBuyer3("차은우", 5, 10000);
		FruitBuyer3 fb3 = new FruitBuyer3("이준호", 0, 50000);
		
		fb1.buyApple(fs1, 3000);
		fb2.buyApple(fs2, 20000);
		fb3.buyApple(fs1, 25000);
		fb1.buyApple(fs1, 17000);
		
		fs1.print(); fs2.print();
		fb1.print(); fb2.print(); fb3.print();
	}
}