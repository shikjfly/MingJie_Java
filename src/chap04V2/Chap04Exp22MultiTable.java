package chap04V2;

import java.util.Scanner;

public class Chap04Exp22MultiTable {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		for (int i = 1; i <=9; i++) {
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d",i*j);
			}//for����
			System.out.println();
		}//for����
		/*
		 * 1X1 2X1 3X1 4X1
		 * 1X2 2X2 3X2 4X2
		 * 1X3 2X3 3X3 4X3
		 * 1X4 2X4 3X4 4X4
		 * */
		stdIn.close();
		
	}//main����
}//�����
