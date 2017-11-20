import java.util.*;
public class ex4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String abc;
System.out.println("문자를 입력하시오.");
		abc=input.next().toLowerCase(); 
		switch(abc){ 
		case "a": case "e": case "i": case "o": case "u": 
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
			break;
		}
	}

}
