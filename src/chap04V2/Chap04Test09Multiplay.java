package chap04V2;

import java.util.Scanner;

public class Chap04Test09Multiplay {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("n的值：");
			n = stdIn.nextInt();
		} while (n<1);//do...while结束
		
		int m=1;
		int multiply = 1;
		while (m < n) {
			multiply *= m++; 
		}//while结束
		System.out.println("1到"+ n +"的积为"+multiply);
		stdIn.close();		
	}//main结束
}//类结束
