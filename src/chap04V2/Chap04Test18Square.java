package chap04V2;

import java.util.Scanner;

public class Chap04Test18Square {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int n=-1;
		for( ;  n<=0 ;) {
			System.out.print("n��ֵ��");
			n = stdIn.nextInt();
		}//for����
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"��ƽ����"+i*i);
		}//for����
		
		stdIn.close();
	}//main����
}//�����
