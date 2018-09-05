package chap04V2;

import java.util.Scanner;

public class Chap04Test06PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("大于1，才输出换行符：");
		int n = stdIn.nextInt();

		while (n-- > 1) { //适用于可改写n的值
			System.out.println();
		}//while结束
		stdIn.close();
		
	}//main结束
}//类结束
