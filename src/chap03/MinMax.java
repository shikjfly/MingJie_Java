package chap03;

import java.util.*;
public class MinMax {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");  int a = stdIn.nextInt();
		System.out.println("����b��");  int b = stdIn.nextInt();
		System.out.println("�����a<=b��");
		
		if (a>b) {
			int t;
			t = a;
			a = b;
			b = t;
		}

		System.out.println("����a��"+a+"��");  
		System.out.println("����b��"+b+"��");  
	}
}
