package lab7;

public class BankAccount {
	int accountNumber; // ���¹�ȣ
	String owner=""; //������
	int balance; //�ܾ�
	public int initialBalance;

	

	public BankAccount (int initialBalance)
	{
		balance = initialBalance;
	}
	
	public void deposit(int amount) {
		int newBalance = balance + amount;
		balance = newBalance;
	/// �Ա�
	}
	
	public void withdraw(int amount) {
	 int newBalance = balance - amount;
	 balance = newBalance;
	}
	
	
	}
