import java.util.*;
public class ex4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String abc;
System.out.println("���ڸ� �Է��Ͻÿ�.");
		abc=input.next().toLowerCase(); 
		switch(abc){ 
		case "a": case "e": case "i": case "o": case "u": 
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}

}
