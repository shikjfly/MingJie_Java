package chap04V2;

import java.util.Scanner;

public class Chap04Exp12OddNo1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("����ֵ��");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while����

		for (int i = 1; i <= n; i += 2) {
			System.out.println(i);
		} //for����
		
		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
