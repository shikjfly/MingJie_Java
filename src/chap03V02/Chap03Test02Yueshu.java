package chap03V02;

import java.util.Scanner;

public class Chap03Test02Yueshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����A��");
		int a = stdIn.nextInt();
		System.out.print("����B��");
		int b = stdIn.nextInt();
		if (a%b==0) {
			System.out.println("B��A��Լ��");
		}else {
			System.out.println("B����A��Լ��");
		}
		stdIn.close();
	}

}
