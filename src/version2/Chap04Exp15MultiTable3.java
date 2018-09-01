package version2;

import java.util.Scanner;

public class Chap04Exp15MultiTable3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(" ");
				System.out.print(i);
				System.out.print("X");
				System.out.print(j);
			}//for结束
			System.out.println();
		}//for结束
		/*
		 * 1X1 1X2 1X3 1X4
		 * 2X1 2X2 2X3 2X4
		 * 3X1 3X2 3X3 3X4
		 * 4X1 4X2 4X3 4X4
		 * */
		stdIn.close();
		
	}//main结束
}//类结束
