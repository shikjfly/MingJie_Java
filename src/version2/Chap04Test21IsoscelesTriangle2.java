package version2;

import java.util.Scanner;

public class Chap04Test21IsoscelesTriangle2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ʾֱ�������·��������Ρ�\n������");
		int n = stdIn.nextInt();
		for (int i = 0; i <=n; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print(' ');
				System.out.print('&');
			}//for���� *
			for (int k = 1; k <=n-i; k++) {
				System.out.print(' ');
				System.out.print('*');
			}//for���� *
			
			
			
			System.out.println();
			
		}//for����
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 * */
		stdIn.close();
		
	}//main����
}//�����
