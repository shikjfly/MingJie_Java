package version2;

import java.util.Scanner;

public class Chap04Test12CountUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("倒数。");

		int x = -1;
		for ( ;  x < 0; ) {
			System.out.print("正整数值：");
			x = stdIn.nextInt();
		}//for结束
		
		for(int i=0 ;  i <= x;  i++) {
			System.out.println(i);
		}//for结束
		
		stdIn.close();
	}//main结束
}//类结束
