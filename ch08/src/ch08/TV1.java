package ch08;

public class TV1  implements RemoteControl {
	public void turnOn() {
		System.out.println("TV를 켭니다");		
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");			
	}
}

class Radio1 implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다");		
	}
	public void turnOff() {
		System.out.println("라디오를 끕니다");			
	}
}