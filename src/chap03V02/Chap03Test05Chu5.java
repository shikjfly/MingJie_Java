package chap03V02;

import java.util.Scanner;

public class Chap03Test05Chu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����ֵ��");
		int n = stdIn.nextInt();
				
		if (n>0) {
			if (n%5 == 0) {
				System.out.println("��ֵ���Ա�5����");
			}else {
				System.out.println("��ֵ�����Ա�5����");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
		stdIn.close();

	}

}
