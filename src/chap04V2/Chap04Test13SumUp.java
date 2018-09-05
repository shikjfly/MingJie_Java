package chap04V2;

import java.util.Scanner;

public class Chap04Test13SumUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("计算1到n的和。");

		int n = -1;
		for ( ;  n < 0; ) {
			System.out.print("n的值：");
			n = stdIn.nextInt();
		}//for结束
		
		int sum=0;
		for(int i=0 ;  i <= n;  i++) {
			sum += i;
		}//for结束
		
		System.out.println("1到"+n+"的和是"+sum+"。");
		
		stdIn.close();
	}//main结束
}//类结束
