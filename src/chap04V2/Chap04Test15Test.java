package chap04V2;

import java.util.Scanner;

public class Chap04Test15Test {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.print("�Ӷ���cm��ʼ��");
		int star = stdIn.nextInt(); //��ʼ
		System.out.print("�Ӷ���cm������");
		int end = stdIn.nextInt();//����
		System.out.print("ÿ�������Ƕ���cm��");
		int inc = stdIn.nextInt();//����

		System.out.println("���   ��׼����");
		for (int i = star; i <= end; i+=inc) {
			System.out.println(i+"  "+(i-100)*0.9);
		}//for����
		
		
		stdIn.close();
	}//main����
}//�����
