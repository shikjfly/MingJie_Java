package chap02;
import java.util.Scanner;;
public class ArithDouble2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x��ֵ��");
		double x = stdIn.nextDouble();
		
		System.out.println("y��ֵ��");
		double y = stdIn.nextDouble();

		System.out.println("�ϼ�ֵ��  "+ (x+y) + "��");
		System.out.println("ƽ��ֵ�� "+ (x+y)/2 + "��");
	}

}
