package chap7;

import java.util.Scanner;

public class Power2 {
	
	static double power(double x, int n) {
		double ans = 1.0;
//		for(int i=0; i<n; i++) {
//			ans = x*ans;
//		}
		while (n-->0) {
			ans *=x;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("实数a: ");  Double a = stdIn.nextDouble();
		System.out.print("实数b: ");  int b = stdIn.nextInt();
		System.err.println(power(a, b));
		
		

	}
}