package chap03;

import java.util.*;

class Test6{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		
		if(a>0) {
			if(a%10==0) {
				System.out.println("��ֵ��10�ı�����");
			}else {
				System.out.println("��ֵ����10�ı�����");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
	}
}
