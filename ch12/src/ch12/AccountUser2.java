package ch12;

public class AccountUser2 extends Thread {
	boolean flag;  // default false
	Account2 act;
	String name;
	public AccountUser2(Account2 act, String name) {
		this.act = act; this.name = name;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {  // 5회 실행
//		객체(계좌) "계좌를 동시에 사용하지 마라"라는 의미
			synchronized (act) {
				int amt = (int)(Math.random()*10000) + 1;
				if (flag) act.deposit(amt, name); // true면 입금
				else act.withdraw(amt, name);     // false면 출금
			}			
			flag = !flag;  // true false번 갈아서 변경
			act.print();
		}
	}
}