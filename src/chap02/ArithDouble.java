package chap02;
import java.util.Scanner;;
public class ArithDouble {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��x��y���мӼ��˳����㡣");
		
		System.out.println("x��ֵ��");
		double x = stdIn.nextDouble();
		
		System.out.println("y��ֵ��");
		double y = stdIn.nextDouble();

		System.out.println("x+y= "+ (x+y) + "��");
		System.out.println("x-y= "+ (x-y) + "��");
		System.out.println("x*y= "+ (x*y) + "��");
		System.out.println("x/y= "+ (x/y) + "��");
		System.out.println("x%y= "+ (x%y) + "��");
	}

}
