package chap03;

import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("����ֵ��");
		int a = stdIn.nextInt();
		
		
		if(  a<0  ) {
			a = -a;
		}

		System.out.println("�����ֵ��"+a+"��");
	}

}
