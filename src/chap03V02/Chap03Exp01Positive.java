package chap03V02;

import java.util.Scanner;

public class Chap03Exp01Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数值：");
		int n = stdIn.nextInt();
		if (n>0) {
			System.out.println("该值为正。");
		}
		stdIn.close();
	}

}
