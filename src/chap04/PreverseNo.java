package chap04;

import java.util.*;

public class PreverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ʾ������ֵ��");
		int n = -1;
		while (n<0) {
			System.out.println("������ֵ��");
			n = stdIn.nextInt();
		}
		System.out.println("���������ǣ�");
		while (n>0) {
			System.out.print(n%10);
			n = n/10;
		}		
	}
}
