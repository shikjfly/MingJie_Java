package chap03;

import java.util.*;

class Test8{
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");
		int a = stdIn.nextInt();
		System.out.println("����b��");
		int b = stdIn.nextInt();
		
		int dif = a>b ? a-b : b-a ;
		
		System.out.println("��ֵ��"+ dif+"��");
	}
}
