package lab7;

public class BankAccount {
	int accountNumber; // 계좌번호
	String owner=""; //예금주
	int balance; //잔액
	public int initialBalance;

	

	public BankAccount (int initialBalance)
	{
		balance = initialBalance;
	}
	
	public void deposit(int amount) {
		int newBalance = balance + amount;
		balance = newBalance;
	/// 입급
	}
	
	public void withdraw(int amount) {
	 int newBalance = balance - amount;
	 balance = newBalance;
	}
	
	
	}
