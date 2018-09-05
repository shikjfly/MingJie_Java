package chap04V2;

import java.util.Scanner;

public class Chap04Test20PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		
		int n;
		do {
			System.out.print("显示n层：");
			n = stdIn.nextInt();
		} while (n<=0); //do..while结束
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print('*');
			}//for结束
			System.out.println();
		}//for结束

		stdIn.close();
	}//main结束
}//类结束
