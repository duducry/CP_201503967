package kim;

	import java.util.Scanner;

	public class ex3  {
	   public static void main(String[] args) {
	      
		   ex3_1 d = new ex3_1();
		   			System.out.print("���� �Է� : ");
		   				Scanner input = new Scanner(System.in);
		   
		   				d.year = input.nextInt();
		   System.out.print("�� �Է� : ");
		   	d.month = input.nextInt();
		   System.out.print("�� �Է� : ");
		   	d.day = input.nextInt();
		   			System.out.println("����� ��¥ ǥ�� : " + d.east());
		   				System.out.print("����� ��¥ ǥ�� : " + d.west());
		   input.close();
	   }
	}
	


