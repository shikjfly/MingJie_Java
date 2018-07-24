package chap02;
import java.util.Scanner;;
public class ArithDouble3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("求三角形的面积。");
		
		System.out.println("底：");
		double x = stdIn.nextDouble();
		
		System.out.println("高：");
		double y = stdIn.nextDouble();

		System.out.println("面积是  "+ (x*y)/2 + "。");
	}

}
