package chap02;
import java.util.Scanner;;
public class Circle2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("半径：");
		double r = stdIn.nextDouble();
		
		System.out.println("周长是"+ 2 * 3.14 * r + "。");
		System.out.println("面积是"+ 3.14 * r * r + "。");
	}

}
