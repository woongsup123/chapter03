package practice3;

public class Account {
	private String accountNo = "";
	private int balance = 0;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
		notifyBalance();
	}
	
	public void save(int amount) {
		balance += amount;
		System.out.println(accountNo + " 계좌에 " + convertToString(amount) + "원이 입금되었습니다.");
		notifyBalance();
	}
	
	public void deposit (int amount) {
		if (balance < amount) {
			System.out.println("금액이 부족합니다. 출금할 수 없습니다.");
		}
		else {
			balance -= amount;
			System.out.println(accountNo + " 계좌에서 " + convertToString(amount) + "원이 출금되었습니다.");
		}
		notifyBalance();
	}
	
	public void notifyBalance() {
		System.out.println(accountNo + " 계좌의 잔고는 " + convertToString(balance) + "원입니다.");
	}
	
	private String convertToString(int amount) {
		if (amount == 0) {
			return "0";
		}
		String str = "";
		int hundredThousand = amount / 100000000;
		if (hundredThousand >= 1) {
			str += hundredThousand + "억";
			amount -= hundredThousand * 100000000;
		}
		int tenThousand = amount / 10000;
		if (tenThousand >= 1) {
			str += tenThousand + "만";
			amount -= tenThousand * 10000;
		}
		if (amount != 0) {
			str += amount;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Account acc = new Account("078-3762-293");
		acc.save(1000000);
		acc.deposit(300000);
	}
}
