package kim;

import java.util.Scanner;
import java.util.Arrays;

public class ex2 {

	public static void main(String[] args) {
		
		  System.out.println("���ڿ��� �Է��Ͻÿ� : ");   
	      Scanner input = new Scanner(System.in);
	      String a = input.nextLine();// ���ڿ� ����
	  
	      				String[] sen = a.split("");
	      
	      					int i; 
	      					int length;
	      							length = a.length(); 
	      								char[] word = a.toCharArray();      
	      
	      int[] num = new int[length];
	      for(i=0; i<length; i++) {
	         if((int)word[i] >= 65 && (int)word[i] <= 90) {
	            num[i] = (int)word[i] + 32;
	         }
	         else if((int)word[i] >= 97 && (int)word[i] <= 122) {
	            num[i] = (int)word[i] - 32;   
	         }  //�ƽ�Ű���� ���ڷ� ��ȯ
	         word[i] = (char)num[i];
	      }
	      for(i=0; i<length; i++) {
	      System.out.print(word[i]);
	      
	     }

	   }
}

