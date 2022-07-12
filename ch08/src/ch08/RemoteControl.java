package ch08;
public interface RemoteControl {
	// 상수 public static final 생량
	int MAX_VOUME = 10;
	int MIN_VOUME = 0;
	// 추상 메서드 public abstract 생략
	void turnOn();
	void turnOff();

	// 디폴트 메서드 실행부를 만들 수 있다
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음 처리합니다");
		else System.out.println("무음 해제 합니다");
	}
	
	// static 메서드도 실행부를 만들 수 있다
	static void changeBattery() {
		System.out.println("건전지를 교환 합니다");
	}
}