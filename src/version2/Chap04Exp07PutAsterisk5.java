package version2;

import java.util.Scanner;

public class Chap04Exp07PutAsterisk5 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();

		while (--n >= 0) { //适用于可改写n的值
			System.out.print('*');//单引号，字符常量
		}//while结束

		System.out.println();
		stdIn.close();
		
	}//main结束
}//类结束
