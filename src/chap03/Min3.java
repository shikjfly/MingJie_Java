package chap03;

import java.util.*;
public class Min3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");
		int a = stdIn.nextInt();
		System.out.println("����b��");
		int b = stdIn.nextInt();
		int min;
		if (a>b) {
			min = b;
		} else {
			min = a;
		}

		System.out.println("��С��ֵ�ǣ�"+min+"��");
	}
}
