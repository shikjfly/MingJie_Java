package chap03;

import java.util.*;
public class Max2Cond {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");
		int a = stdIn.nextInt();
		System.out.println("����b��");
		int b = stdIn.nextInt();
		
		System.out.println("��С��ֵ�ǣ�"+ (a>b?b:a)+"��");
	}
}
