package chap02;
import java.util.Scanner;;
public class Minus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数值：");
		int a = stdIn.nextInt();
		
		int b = -a;
		
		System.out.println(a+" 的符号取反后的值是 "+b+ "。");

	}

}
