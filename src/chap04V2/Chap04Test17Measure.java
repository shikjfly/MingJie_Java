package chap04V2;

import java.util.Scanner;

public class Chap04Test17Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int x=-1;
		for( ;  x<=0 ;) {
			System.out.print("整数值：");
			x = stdIn.nextInt();
		}//for结束
		
		int n=0;
		for (int i = 1; i <= x ; i++) {
			if (x%i == 0) {
				System.out.println(i);
				n++;
			}//if结束
		}//for结束
		System.out.println("约数有"+n+"个。");
		
		stdIn.close();
	}//main结束
}//类结束
