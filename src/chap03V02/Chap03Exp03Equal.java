package chap03V02;

import java.util.Scanner;

public class Chap03Exp03Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����a��");
		int a = stdIn.nextInt();
		System.out.print("����b��");
		int b = stdIn.nextInt();
		if (a==b) {
			System.out.println("����ֵ��ȡ�");
		}else {
			System.out.println("����ֵ����ȡ�");
		}
		stdIn.close();

	}

}
