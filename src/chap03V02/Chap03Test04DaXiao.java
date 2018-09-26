package chap03V02;

import java.util.Scanner;

public class Chap03Test04DaXiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		if (a>b) {
			System.out.println("a更大");
		}else if(a<b){
			System.out.println("b更大");
		}else {
			System.out.println("a和b相等");
		}
		stdIn.close();
	}

}
