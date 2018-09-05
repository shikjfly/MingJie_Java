package chap04V2;

import java.util.Scanner;

public class Chap04Exp08PutAsterisk2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();
		int i=1;
		while (n>=i) {
			System.out.print('*');//单引号，字符常量
			i++;
		}//while结束

		System.out.println();
		stdIn.close();
		
	}//main结束
}//类结束
