package ch07;
public class AnimalEx {
	public static void main(String[] args) {
//		  각각을 생성하여 move()와 x를 출력
//		  그 동물이 Bird인 경우에는 eat()메서드 실행
		  Animal[] animal = new Animal[3];
		  animal[0] = new Bird();  animal[1] = new Pig();  animal[2] = new Fish();
		  
		  for(int i = 0; i < animal.length;i++) {
			  animal[i].move(); // 자식 메서드
			  System.out.println("x = "+animal[i].x); // 부모 변수
			  if (animal[i] instanceof Bird) {
				  ((Bird)animal[i]).eat();
			  }
		  }
		  System.out.println("================");
		  for (Animal an:animal) {
			  an.move(); // 자식 메서드
			  System.out.println("x = "+an.x); // 부모 변수
			  if (an instanceof Bird) {
				  ((Bird)an).eat();
			  }
		  }
	}
}
