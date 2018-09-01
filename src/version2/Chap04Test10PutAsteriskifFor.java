package version2;

import java.util.Scanner;

public class Chap04Test10PutAsteriskifFor {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print('*');
		} //for结束
		
		if (n>=1) {
			System.out.println();
		}//if结束
		stdIn.close();
		
	}//main结束
}//类结束
