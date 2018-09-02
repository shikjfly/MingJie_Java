package version2;

import java.util.Scanner;

public class Chap04Test08No {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int x;
		do {
			System.out.print("整数值：");
			x = stdIn.nextInt();
		} while (x<0);//do...while结束
		
		int n=0;
		while (x>0) {
			x /= 10;
			n++;
		}//while结束
		System.out.println("该值为"+ n +"位。");
		stdIn.close();		
	}//main结束
}//类结束
