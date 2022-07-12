package ch08;
public class RemoteControlEx2 {
//	interface는 객체를 생성 못함
	public static void main(String[] args) {
//	객체를 생성했다는 것은 클래스가 있는데 이름을 몰라 : 익명(무명) (내부,중첩,inner)클래스 	RemoteControlEx2$1
		RemoteControl rc1 = new RemoteControl() {
			public void turnOn() {	System.out.println("스피커를 켭니다");		}
			public void turnOff() {	System.out.println("스피커를 끕니다");		}
		};
		rc1.turnOn();  rc1.turnOff(); rc1.setMute(false); RemoteControl.changeBattery();
//	객체를 생성했다는 것은 클래스가 있는데 이름을 몰라 : 익명(무명) 클래스 	RemoteControlEx2$2
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("나도 스피커 켰어");
			}
			public void turnOff() {
				System.out.println("스피커 껐다");
			}
		};
		rc2.turnOn();  rc2.turnOff(); rc2.setMute(true); RemoteControl.changeBattery();
	}
}