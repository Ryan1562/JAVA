package ch05;
public class AccountEx {
	public static void main(String[] args) {
		Account ac1 = new Account("국민1224", "이만희", 1000);
		Account ac2 = new Account("신한3456", "전광훈", 2000);
		Account ac3 = new Account("우리5678", "문선명", 3000);
		int money = 0;
		for(int i = 0; i < 6; i++) {
			money = (int)(Math.random()*1000) + 1;	ac1.deposit(money);
			money = (int)(Math.random()*1200) + 1;	ac1.withdraw(money);
		}
		ac1.disp();
		for(int i = 0; i < 6; i++) {
			money = (int)(Math.random()*1500) + 1;	ac2.deposit(money);
			money = (int)(Math.random()*2200) + 1;	ac2.withdraw(money);
		}
		ac2.disp();
		for(int i = 0; i < 6; i++) {
			money = (int)(Math.random()*2500) + 1;	ac3.deposit(money);
			money = (int)(Math.random()*3200) + 1;	ac3.withdraw(money);
		}
		ac3.disp();
	}
}