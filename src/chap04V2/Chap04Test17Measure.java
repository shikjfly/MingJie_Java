package chap04V2;

import java.util.Scanner;

public class Chap04Test17Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int x=-1;
		for( ;  x<=0 ;) {
			System.out.print("����ֵ��");
			x = stdIn.nextInt();
		}//for����
		
		int n=0;
		for (int i = 1; i <= x ; i++) {
			if (x%i == 0) {
				System.out.println(i);
				n++;
			}//if����
		}//for����
		System.out.println("Լ����"+n+"����");
		
		stdIn.close();
	}//main����
}//�����
