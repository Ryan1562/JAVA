package ch12;

public class AccountUser extends Thread {
	boolean flag;  // default false
	Account act;
	String name;
	public AccountUser(Account act, String name) {
		this.act = act; this.name = name;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {  // 5회 실행
			int amt = (int)(Math.random()*10000) + 1;
			if (flag) act.deposit(amt, name); // true면 입금
			else act.withdraw(amt, name);     // false면 출금
			
			flag = !flag;  // true false번 갈아서 변경
			act.print();
		}
	}
}