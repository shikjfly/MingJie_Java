package chap03;

import java.util.*;
public class Test9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");  int a = stdIn.nextInt();
		System.out.println("����b��");  int b = stdIn.nextInt();
		
		if (a<b) {
			System.out.println("��С��ֵ��"+a+"��");  
			System.out.println("�ϴ��ֵ��"+b+"��"); 			
		}else if (a==b) {
			System.out.println("����ֵ��ȡ�");  
		}else {
			System.out.println("��С��ֵ��"+b+"��");  
			System.out.println("�ϴ��ֵ��"+a+"��"); 			
		}

	}
}
