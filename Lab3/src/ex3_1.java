	import java.util.*;	

public class ex3_1 {
	
		public static void main(String[] args) {
			System.currentTimeMillis();		
			Random rand = new Random();	
			Scanner scan = new Scanner(System.in);
			int a;
			String user;
			int b = -1;
			
			System.out.print("가위 바위 보 : ");
			user = scan.nextLine();
			
			if(user.equals("보"))
				b = 2;
			else if(user.equals("바위"))
				b = 1;
			else if(user.equals("가위"))
				b = 0;

			a = b-1 + rand.nextInt(b+2);		
			
			if(a == b)	{
				System.out.println("컴퓨터 : " + user);
				System.out.println("비겼다!");
			}
			else if(a > b)	{
				if(user.equals("가위"))
					System.out.println("컴퓨터 : 보");
				else if(user.equals("바위"))
					System.out.println("컴퓨터 : 가위");
				else if(user.equals("보"))
					System.out.println("컴퓨터 : 바위");
				System.out.println("이겼다!");
			}
			else if(a < b)	{
				if(user.equals("가위"))
					System.out.println("컴퓨터 : 바위");
				else if(user.equals("바위"))
					System.out.println("컴퓨터 : 보");
				else if(user.equals("보"))
					System.out.println("컴퓨터 : 가위");
				System.out.println("졌다!");
			}
		}
	}
