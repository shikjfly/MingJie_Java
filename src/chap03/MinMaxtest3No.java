package chap03;

import java.util.*;
public class MinMaxtest3No {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");  int a = stdIn.nextInt();
		System.out.println("����b��");  int b = stdIn.nextInt();
		System.out.println("����c��");  int c = stdIn.nextInt();
		System.out.println("�����c<=b<= a��");

		if (a>b) {
			int t;
			t = a;
			a = b;
			b = t;
		}
		if (a>c) {
			int t;
			t = a;
			a = c;
			c = t;
		}
		if (b>c) {
			int t;
			t = b;
			b = c;
			c = t;
		}

		System.out.println("����a��"+a+"��");  
		System.out.println("����b��"+b+"��");  
		System.out.println("����c��"+c+"��");  
	}
}
