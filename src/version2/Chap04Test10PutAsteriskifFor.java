package version2;

import java.util.Scanner;

public class Chap04Test10PutAsteriskifFor {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print('*');
		} //for����
		
		if (n>=1) {
			System.out.println();
		}//if����
		stdIn.close();
		
	}//main����
}//�����
