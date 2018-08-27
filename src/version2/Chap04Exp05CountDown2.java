package version2;

import java.util.Scanner;

public class Chap04Exp05CountDown2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("倒数。");
		int x;
		do {
			System.out.print("正整数值：");
			x = stdIn.nextInt();
		} while (x <= 0);//do-while结束
		
		while (x >= 0) {
			System.out.println(x--);
		}//while结束
		stdIn.close();
	}//main结束
}//类结束
