	import java.util.*;	

public class ex3_1 {
	
		public static void main(String[] args) {
			System.currentTimeMillis();		
			Random rand = new Random();	
			Scanner scan = new Scanner(System.in);
			int a;
			String user;
			int b = -1;
			
			System.out.print("���� ���� �� : ");
			user = scan.nextLine();
			
			if(user.equals("��"))
				b = 2;
			else if(user.equals("����"))
				b = 1;
			else if(user.equals("����"))
				b = 0;

			a = b-1 + rand.nextInt(b+2);		
			
			if(a == b)	{
				System.out.println("��ǻ�� : " + user);
				System.out.println("����!");
			}
			else if(a > b)	{
				if(user.equals("����"))
					System.out.println("��ǻ�� : ��");
				else if(user.equals("����"))
					System.out.println("��ǻ�� : ����");
				else if(user.equals("��"))
					System.out.println("��ǻ�� : ����");
				System.out.println("�̰��!");
			}
			else if(a < b)	{
				if(user.equals("����"))
					System.out.println("��ǻ�� : ����");
				else if(user.equals("����"))
					System.out.println("��ǻ�� : ��");
				else if(user.equals("��"))
					System.out.println("��ǻ�� : ����");
				System.out.println("����!");
			}
		}
	}
