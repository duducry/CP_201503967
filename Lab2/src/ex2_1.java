import java.util.*;
public class ex2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("초를 입력하시오");
		int time= input.nextInt() ; //* 입력받은 초 *

		System.out.println((time/3600)+"시간 "+(time%3600/60)+ "분 " + (time%3600%60)+"초 입니다.");
			

	}

}
