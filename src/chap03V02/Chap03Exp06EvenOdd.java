package chap03V02;

import java.util.Scanner;

public class Chap03Exp06EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����ֵ��");
		int n = stdIn.nextInt();
		
		
		if (n>0) {
			if (n%2 == 0) {
				System.out.println("��ֵΪż����");
			}else {
				System.out.println("��ֵΪ������");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
		stdIn.close();

	}

}