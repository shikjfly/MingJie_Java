package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("����ֵ��");
			int n = stdIn.nextInt();
			if (n>0) {
				System.out.println("��ֵΪ��");
			}else if (n==0) {
				System.out.println("��ֵΪ0");
			}else {
				System.out.println("��ֵΪ��");
			}
			System.out.println("�Ƿ�Ҫ����һ�Σ�1--YES; 0---No");
			retry = stdIn.nextInt();
		} while (retry ==1);
		
	}

}
