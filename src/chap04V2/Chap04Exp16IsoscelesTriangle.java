package chap04V2;

import java.util.Scanner;

public class Chap04Exp16IsoscelesTriangle {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("显示直角在左下方的三角形。\n层数：");
		int n = stdIn.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}//for结束
			System.out.println();
		}//for结束
		/*
		 * 
		 * */
		stdIn.close();
		
	}//main结束
}//类结束
