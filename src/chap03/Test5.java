package chap03;

import java.util.*;

class Test5{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%3==0) {
				System.out.println("��ֵ���Ա�3������");
			}else if(a%3==1) {
				System.out.println("��ֵ��3��1��");
			}else {
				System.out.println("��ֵ��3��2��");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
	}
}
