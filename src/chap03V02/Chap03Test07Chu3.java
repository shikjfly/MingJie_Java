package chap03V02;

import java.util.Scanner;

public class Chap03Test07Chu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����ֵ��");
		int n = stdIn.nextInt();
				
		if (n>0) {
			if (n%3 == 0) {
				System.out.println("��ֵ���Ա�3������");
			}else if(n%3 == 1){
				System.out.println("��ֵ��3��1��");
			}else {
				System.out.println("��ֵ��3��2��");
			}
		}else {
			System.out.println("����Ĳ�����ֵ��");
		}
		stdIn.close();

	}

}
