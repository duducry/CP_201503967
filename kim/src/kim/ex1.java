package kim;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) 
		{
	Scanner input = new Scanner(System.in);
			int ja = 0; int mo = 0;
			
			System.out.println("���ڿ��� �Է��Ͻÿ�");
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
		
		System.out.println("������ ������:" + ja + "��");
		System.out.println("������ ������:" + mo + "��");
	}
		
}
