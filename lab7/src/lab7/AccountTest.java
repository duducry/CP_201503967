
package lab7;
import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
int firstpay = 0;
	
	//°èÁÂ1	
		BankAccount hong = new BankAccount(firstpay); 
		System.out.println("°èÁÂ 1 Á¤º¸ ÀÔ·Â");
		System.out.println("¿¹±İÁÖ : È«±æµ¿");
		System.out.println("8ÀÚ¸® ¼öÀÇ °èÁÂ¹øÈ£ :");
		hong.accountNumber=input.nextInt();
		System.out.println("ÃÊ±âÀÜ¾×:");
		hong.balance= input.nextInt();
		System.out.println();
		
		//°èÁÂ 2
		BankAccount kim = new BankAccount(firstpay);
		System.out.println("°èÁÂ 2 Á¤º¸ ÀÔ·Â");
		System.out.println("¿¹±İÁÖ : ±è´õ´ö");
		System.out.println("°èÁÂ¹øÈ£ :");
		kim.accountNumber=input.nextInt();
		System.out.println("ÃÊ±âÀÜ¾×:");
		kim.balance= input.nextInt();
		System.out.println();
		
		System.out.println("°èÁÂ1¿¡¼­ °èÁÂ2·Î ¼Û±İÇÒ ±İ¾× :");
		int pay = input.nextInt();
		hong.deposit(pay);
		kim.withdraw(pay);

		System.out.println("===========");
		System.out.println("°èÁÂ1");
		System.out.println("¿¹±İÁÖ : È«±æµ¿ ");
		System.out.println("°èÁÂ¹øÈ£ : "+ hong.accountNumber);
		System.out.println("ÀÜ¾× : "+ hong.balance);
		System.out.println();

		System.out.println("°èÁÂ2");
		System.out.println("¿¹±İÁÖ : ±è´õ´ö ");
		System.out.println("°èÁÂ¹øÈ£ : "+ kim.accountNumber);
		System.out.println("ÀÜ¾× : "+ kim.balance);
		System.out.println();


	}

}
