package chap03V02;

import java.util.Scanner;

public class Chap03Test01Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数值：");
		int n = stdIn.nextInt();
		if (n<0) {
			n = -n;
		}
		System.out.println("其绝对值为"+n);
		stdIn.close();
	}

}
