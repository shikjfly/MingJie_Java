package chap04V2;

import java.util.Scanner;

public class Chap04Test13SumUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("����1��n�ĺ͡�");

		int n = -1;
		for ( ;  n < 0; ) {
			System.out.print("n��ֵ��");
			n = stdIn.nextInt();
		}//for����
		
		int sum=0;
		for(int i=0 ;  i <= n;  i++) {
			sum += i;
		}//for����
		
		System.out.println("1��"+n+"�ĺ���"+sum+"��");
		
		stdIn.close();
	}//main����
}//�����
