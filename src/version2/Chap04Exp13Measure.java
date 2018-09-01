package version2;

import java.util.Scanner;

public class Chap04Exp13Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("整数值：");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while结束

		for (int i = 1; i <= n; i++) {
			if ( n%i == 0) {
				System.out.println(i);
			}//if结束
		} //for结束

		stdIn.close();
		
	}//main结束
}//类结束
