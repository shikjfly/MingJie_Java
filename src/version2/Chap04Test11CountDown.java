package version2;

import java.util.Scanner;

public class Chap04Test11CountDown {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("倒数。");
//		int x;
//		do {
//			System.out.print("正整数值：");
//			x = stdIn.nextInt();
//		} while (x<0); //do...while结束
//
//		while (x>=0) {
//			System.out.println(x);
//			x--;
//		}
		int x = -1;
		for ( ;  x < 0; ) {
			System.out.print("正整数值：");
			x = stdIn.nextInt();
		}//for结束
		
		for( ;  x>=0;  x--) {
			System.out.println(x);
		}//for结束
		
		stdIn.close();
	}//main结束
}//类结束
