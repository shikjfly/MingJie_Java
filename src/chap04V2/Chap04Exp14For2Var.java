package chap04V2;

import java.util.Scanner;

public class Chap04Exp14For2Var {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("����ֵ��");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while����

		for (int i = 1; i <= n; i++) {
			
			System.out.println(i+" "+(n-i));
			
		} //for����

		stdIn.close();
		
	}//main����
}//�����
