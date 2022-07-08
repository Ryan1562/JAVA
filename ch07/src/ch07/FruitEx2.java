package ch07;
public class FruitEx2 {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("로제", 30, 1000);
		FruitSeller2 fs2 = new FruitSeller2("제니", 20, 0);
		FruitBuyer2 fb1 = new FruitBuyer2("화사",0, 20000);
		FruitBuyer2 fb2 = new FruitBuyer2("차은우", 5, 10000);
		FruitBuyer2 fb3 = new FruitBuyer2("이준호", 0, 50000);
		
		fb1.buyApple(fs1, 3000);
		fb2.buyApple(fs2, 2000);
		fb3.buyApple(fs1, 2000);
		
		fs1.print(); fs2.print();
		fb1.print(); fb2.print(); fb3.print();
	}
}