package chap03;

import java.util.*;
public class Sort2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");  int a = stdIn.nextInt();
		System.out.println("����b��");  int b = stdIn.nextInt();
		int min,max;
		
		if (a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;			
		}

		System.out.println("�ϴ��ֵ�ǣ�"+max+"��");
		System.out.println("��С��ֵ�ǣ�"+min+"��");
	}
}
