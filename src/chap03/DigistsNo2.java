package chap03;

import java.util.*;

class DigistsNo2{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a��ֵ��");
		int a = stdIn.nextInt();
		
		if(a==0) {
			System.out.println("�����0��");
		}else if(a<=-10 || a>=10){
			System.out.println("���������λ�������ϡ�");
		}else{
			System.out.println("�������һλ����");
		}
	}
}
