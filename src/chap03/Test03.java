package chap03;

import java.util.*;

class Test03{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		System.out.println("b��ֵ��");
		int b = stdIn.nextInt();
		
		if(a>b) {
			System.out.println("a����");
		}else if(a==b) {
			System.out.println("a��b��ȡ�");
		}else {
			System.out.println("b����");
		}
	}
}
