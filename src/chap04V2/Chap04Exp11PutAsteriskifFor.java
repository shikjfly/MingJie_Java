package chap04V2;

import java.util.Scanner;

public class Chap04Exp11PutAsteriskifFor {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();
		
//		int i=0;
//		while (i<n) {
//			System.out.print('*');
//			i++;
//		} //while结束
		
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		} //for结束
		

		System.out.println();
		stdIn.close();
		
	}//main结束
}//类结束
