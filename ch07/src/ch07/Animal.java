package ch07;
public class Animal {
	int x = 7;
	void move() {	System.out.println("움직인다");	}
}
class Bird extends Animal {
	void move() {	System.out.println("날개로 날라다닌다");	}
	void eat() {
		System.out.println("부리로 쪼아 먹는다");
	}
}
class Pig extends Animal {
	int x = 6;
	void move() {	System.out.println("네발로 긴다");	}
}
class Fish extends Animal {
	int x = 55;
	void move() {	
		System.out.println("지느러미로 헤엄친다");	
	}
}
