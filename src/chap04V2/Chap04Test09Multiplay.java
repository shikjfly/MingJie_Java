package chap04V2;

import java.util.Scanner;

public class Chap04Test09Multiplay {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("n��ֵ��");
			n = stdIn.nextInt();
		} while (n<1);//do...while����
		
		int m=1;
		int multiply = 1;
		while (m < n) {
			multiply *= m++; 
		}//while����
		System.out.println("1��"+ n +"�Ļ�Ϊ"+multiply);
		stdIn.close();		
	}//main����
}//�����
