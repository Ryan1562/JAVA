package ch12;

public class AccountEx1 {
	public static void main(String[] args) {
		Account act = new Account(10000); // 통장 개설 10000
		AccountUser[] au = new AccountUser[5];
		au[0] = new AccountUser(act, "제니");
		au[1] = new AccountUser(act, "로제");
		au[2] = new AccountUser(act, "보검");
		au[3] = new AccountUser(act, "은우");
		au[4] = new AccountUser(act, "IU");
		
		for(AccountUser a : au) {
			a.start();
		}
	}
}