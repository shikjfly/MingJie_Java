package chap03;

import java.util.*;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("����a��");
		int a = stdIn.nextInt();
		
		System.out.println("����b��");
		int b = stdIn.nextInt();
		
		if(a==b) {
			System.out.println("����ֵ��ȡ�");
		}else {
			System.out.println("����ֵ����ȡ�");			
		}
	}

}
