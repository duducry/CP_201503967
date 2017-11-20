import java.util.*;

public class ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.until.scanner


Scanner input = new Scanner(System.in);

System.out.print("년도를 입력하시오");
	int year=input.nextInt() ; // * 입력받은 년도 *

	if((0==(year % 4) &  0!=(year %100)) ||  0==(year%400))
	

	System.out.println(year+"년은 윤년입니다.");

	else
	
	System.out.println(year+"년은 윤년이 아닙니다.");


}


	}


