package chap02;
import java.util.Scanner;;
public class Circle1 {

	public static void main(String[] args) {
		
		final double PI = 3.1416;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�뾶��");
		double r = stdIn.nextDouble();
		
		System.out.println("�ܳ���"+ 2 * PI * r + "��");
		System.out.println("�����"+ PI * r * r + "��");
	}

}
