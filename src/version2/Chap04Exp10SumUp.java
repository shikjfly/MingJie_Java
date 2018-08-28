package version2;

import java.util.Scanner;

public class Chap04Exp10SumUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("计算1到n的和。");
		int n;
		do {
			System.out.print("n的值：");
			n = stdIn.nextInt();
		} while (n<0);//do..while结束
		
		
		int sum=0;
		int i = 0;
		while (n>i) {
			 sum += ++i;
		}//while结束
		System.out.print("1到"+n+"的和是"+sum+"。");
		stdIn.close();
		
	}//main结束
}//类结束
