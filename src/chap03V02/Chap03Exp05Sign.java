package chap03V02;

import java.util.Scanner;

public class Chap03Exp05Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����ֵ��");
		int n = stdIn.nextInt();
		if (n > 0) {
			System.out.println("��ֵΪ����");
		}else if(n==0){
			System.out.println("��ֵΪ0��");
		}else {
			System.out.println("��ֵΪ����");
		}
		stdIn.close();

	}

}
