package chap02;
import java.util.Scanner;;
public class ArithInt3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数值：");
		int x = stdIn.nextInt();

		System.out.println("加上10后的值是"+ (x+10) + "。");
		System.out.println("减去10后的值是"+ (x-10) + "。");
	}

}
