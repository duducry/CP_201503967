import java.util.*;
public class ex2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("�ʸ� �Է��Ͻÿ�");
		int time= input.nextInt() ; //* �Է¹��� �� *

		System.out.println((time/3600)+"�ð� "+(time%3600/60)+ "�� " + (time%3600%60)+"�� �Դϴ�.");
			

	}

}
