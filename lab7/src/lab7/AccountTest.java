
package lab7;
import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
int firstpay = 0;
	
	//����1	
		BankAccount hong = new BankAccount(firstpay); 
		System.out.println("���� 1 ���� �Է�");
		System.out.println("������ : ȫ�浿");
		System.out.println("8�ڸ� ���� ���¹�ȣ :");
		hong.accountNumber=input.nextInt();
		System.out.println("�ʱ��ܾ�:");
		hong.balance= input.nextInt();
		System.out.println();
		
		//���� 2
		BankAccount kim = new BankAccount(firstpay);
		System.out.println("���� 2 ���� �Է�");
		System.out.println("������ : �����");
		System.out.println("���¹�ȣ :");
		kim.accountNumber=input.nextInt();
		System.out.println("�ʱ��ܾ�:");
		kim.balance= input.nextInt();
		System.out.println();
		
		System.out.println("����1���� ����2�� �۱��� �ݾ� :");
		int pay = input.nextInt();
		hong.deposit(pay);
		kim.withdraw(pay);

		System.out.println("===========");
		System.out.println("����1");
		System.out.println("������ : ȫ�浿 ");
		System.out.println("���¹�ȣ : "+ hong.accountNumber);
		System.out.println("�ܾ� : "+ hong.balance);
		System.out.println();

		System.out.println("����2");
		System.out.println("������ : ����� ");
		System.out.println("���¹�ȣ : "+ kim.accountNumber);
		System.out.println("�ܾ� : "+ kim.balance);
		System.out.println();


	}

}
