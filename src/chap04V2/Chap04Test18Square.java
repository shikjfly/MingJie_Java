package chap04V2;

import java.util.Scanner;

public class Chap04Test18Square {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int n=-1;
		for( ;  n<=0 ;) {
			System.out.print("n的值：");
			n = stdIn.nextInt();
		}//for结束
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"的平方是"+i*i);
		}//for结束
		
		stdIn.close();
	}//main结束
}//类结束
