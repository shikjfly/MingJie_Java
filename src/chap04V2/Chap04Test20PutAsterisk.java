package chap04V2;

import java.util.Scanner;

public class Chap04Test20PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		
		int n;
		do {
			System.out.print("��ʾn�㣺");
			n = stdIn.nextInt();
		} while (n<=0); //do..while����
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print('*');
			}//for����
			System.out.println();
		}//for����

		stdIn.close();
	}//main����
}//�����
