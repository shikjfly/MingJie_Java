package chap04V2;

import java.util.Scanner;

public class Chap04Exp12OddNo {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("����ֵ��");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while����

		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				System.out.println(i+1);
			}//if����
		} //for����
		
		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
