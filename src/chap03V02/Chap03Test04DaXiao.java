package chap03V02;

import java.util.Scanner;

public class Chap03Test04DaXiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����a��");
		int a = stdIn.nextInt();
		System.out.print("����b��");
		int b = stdIn.nextInt();
		if (a>b) {
			System.out.println("a����");
		}else if(a<b){
			System.out.println("b����");
		}else {
			System.out.println("a��b���");
		}
		stdIn.close();
	}

}
