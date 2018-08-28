package version2;

import java.util.Scanner;

public class Chap04Exp07PutAsterisk1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();

		if (n>0) {
			while (n>0) {
				System.out.print("*");
				n--;
			}//while结束
		}else {
			System.out.println();
		}//if结束
		stdIn.close();
		
	}//main结束
}//类结束
