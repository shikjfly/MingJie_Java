package chap03V02;

import java.util.Scanner;

public class Chap03Test06Bei10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����ֵ��");
		int n = stdIn.nextInt();
				
		if (n>0) {
			if (n%10 == 0) {
				System.out.println("��ֵ��10�ı�����");
			}else {
				System.out.println("��ֵ����10�ı�����");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
		stdIn.close();

	}

}
