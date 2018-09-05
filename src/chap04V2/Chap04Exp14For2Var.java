package chap04V2;

import java.util.Scanner;

public class Chap04Exp14For2Var {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("整数值：");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while结束

		for (int i = 1; i <= n; i++) {
			
			System.out.println(i+" "+(n-i));
			
		} //for结束

		stdIn.close();
		
	}//main结束
}//类结束
