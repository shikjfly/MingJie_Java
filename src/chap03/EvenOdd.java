package chap03;

import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("����ֵ��");
		int a = stdIn.nextInt();
		
		if(  a>0 ) {
			if(a%2 == 0) {
				System.out.println("�������ż��");	
			}else {
				System.out.println("�����������");	
			}
					
		}else {
			System.out.println("����Ĳ���������");	
		}

	}

}
