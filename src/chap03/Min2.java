package chap03;

import java.util.*;
public class Min2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");
		int a = stdIn.nextInt();
		System.out.println("����b��");
		int b = stdIn.nextInt();
		if (a>b) {
			System.out.println("��С��ֵ�ǣ�"+b+"��");
		} else {
			System.out.println("��С��ֵ�ǣ�"+a+"��");
		}
	}
}
