package kim;

	import java.util.Scanner;

	public class ex3  {
	   public static void main(String[] args) {
	      
		   ex3_1 d = new ex3_1();
		   			System.out.print("연도 입력 : ");
		   				Scanner input = new Scanner(System.in);
		   
		   				d.year = input.nextInt();
		   System.out.print("월 입력 : ");
		   	d.month = input.nextInt();
		   System.out.print("일 입력 : ");
		   	d.day = input.nextInt();
		   			System.out.println("동양식 날짜 표현 : " + d.east());
		   				System.out.print("서양식 날짜 표현 : " + d.west());
		   input.close();
	   }
	}
	


