package chap02;
import java.util.Scanner;;
public class ArithInt3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����ֵ��");
		int x = stdIn.nextInt();

		System.out.println("����10���ֵ��"+ (x+10) + "��");
		System.out.println("��ȥ10���ֵ��"+ (x-10) + "��");
	}

}
