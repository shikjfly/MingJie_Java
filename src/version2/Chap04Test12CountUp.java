package version2;

import java.util.Scanner;

public class Chap04Test12CountUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("������");

		int x = -1;
		for ( ;  x < 0; ) {
			System.out.print("������ֵ��");
			x = stdIn.nextInt();
		}//for����
		
		for(int i=0 ;  i <= x;  i++) {
			System.out.println(i);
		}//for����
		
		stdIn.close();
	}//main����
}//�����
