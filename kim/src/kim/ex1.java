package kim;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) 
		{
	Scanner input = new Scanner(System.in);
			int ja = 0; int mo = 0;
			
			System.out.println("문자열을 입력하시오");
	String s = input.nextLine();
	 
	for (int i = 0; i < s.length(); i++ )
	 
	{
		String cs = s.substring(i,i+1);
		char ccs = s.charAt(i);
		if(cs.equalsIgnoreCase("a") == true
			|| cs.equalsIgnoreCase("e") == true
			|| cs.equalsIgnoreCase("i") == true
			|| cs.equalsIgnoreCase("o") == true
			|| cs.equalsIgnoreCase("u") == true)
		{ mo++; }
	 
		else if (('a'<= ccs && ccs <= 'z')
			|| ('A'<= ccs && ccs <= 'Z'))
			ja++;
	 
		
		}
		
		System.out.println("자음의 갯수는:" + ja + "개");
		System.out.println("모음의 갯수는:" + mo + "개");
	}
		
}
