package chap03V02;

import java.util.Scanner;

public class Chap03Test02Yueshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数A：");
		int a = stdIn.nextInt();
		System.out.print("整数B：");
		int b = stdIn.nextInt();
		if (a%b==0) {
			System.out.println("B是A的约数");
		}else {
			System.out.println("B不是A的约数");
		}
		stdIn.close();
	}

}
