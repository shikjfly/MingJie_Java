package chap04V2;

import java.util.Scanner;

public class Chap04Exp14For2Var1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("整数值：");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while结束

		for (int i = 1, j=n-1; i <= n; i++,j--) {
			
			System.out.println(i+" "+j);
			
		} //for结束

		stdIn.close();
		
	}//main结束
}//类结束
