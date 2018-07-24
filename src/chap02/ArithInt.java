package chap02;
import java.util.Scanner;;
public class ArithInt {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("对x和y进行加减乘除运算。");
		
		System.out.println("x的值：");
		int x = stdIn.nextInt();
		
		System.out.println("y的值：");
		int y = stdIn.nextInt();

		System.out.println("x+y= "+ (x+y) + "。");
		System.out.println("x-y= "+ (x-y) + "。");
		System.out.println("x*y= "+ (x*y) + "。");
		System.out.println("x/y= "+ (x/y) + "。");
		System.out.println("x%y= "+ (x%y) + "。");
	}

}
