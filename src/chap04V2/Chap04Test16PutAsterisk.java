package chap04V2;

import java.util.Scanner;

public class Chap04Test16PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
//		int x;
//		do {
//			System.out.print("要显示多少个*呢：");
//			x = stdIn.nextInt();
//		} while (x<=0);
		
		int x;
		for(x=-1; x<=0; ) {
			System.out.print("要显示多少个*呢：");
			x = stdIn.nextInt();
		}//for结束
		
		for(int i=1 ; i <= x/5; i++) {
			System.out.println("*****");
		}//for结束
		for(int i=1 ; i <= x%5; i++) {
			System.out.print("*");
		}//for结束
		
		stdIn.close();
	}//main结束
}//类结束
