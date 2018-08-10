package chap7;

import java.util.Scanner;

public class putStars {
	
	static void putStars(int n) {

		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("显示直角在左下方的三角形。 ");  
		System.out.print("层数： ");  int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			putStars(i);	
			System.out.println();
		}
		
		

	}
}