package version2;

import java.util.Scanner;

public class Chap04Exp13Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
				
		int n;
		do {
			System.out.print("����ֵ��");
			n = stdIn.nextInt();
		} while ( n<1 );//do...while����

		for (int i = 1; i <= n; i++) {
			if ( n%i == 0) {
				System.out.println(i);
			}//if����
		} //for����

		stdIn.close();
		
	}//main����
}//�����
