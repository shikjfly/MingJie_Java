package chap03;

import java.util.*;

class DigistsNo1{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		
		if(a==0) {
			System.out.println("�����0��");
		}else if(a>=-9 && a<=9){
			System.out.println("�������һλ����");
		}else{
			System.out.println("���������λ�������ϡ�");
		}
	}
}
