package chap03;

import java.util.*;

class Test4{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%5==0) {
				System.out.println("��ֵ���Ա�5������");
			}else {
				System.out.println("��ֵ�����Ա�5������");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
	}
}
