package kim;

import java.util.Scanner;
import java.util.Arrays;

public class ex2 {

	public static void main(String[] args) {
		
		  System.out.println("문자열을 입력하시오 : ");   
	      Scanner input = new Scanner(System.in);
	      String a = input.nextLine();// 문자열 저장
	  
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
	         }  //아스키값을 문자로 변환
	         word[i] = (char)num[i];
	      }
	      for(i=0; i<length; i++) {
	      System.out.print(word[i]);
	      
	     }

	   }
}

