package ch12;

public class AccountEx2 {
	public static void main(String[] args) {
		Account2 act = new Account2(10000); // 통장 개설 10000
		AccountUser2[] au = new AccountUser2[5];
		au[0] = new AccountUser2(act, "제니");
		au[1] = new AccountUser2(act, "로제");
		au[2] = new AccountUser2(act, "보검");
		au[3] = new AccountUser2(act, "은우");
		au[4] = new AccountUser2(act, "IU");
		
		for(AccountUser2 a : au) {
			a.start();
		}
	}
}