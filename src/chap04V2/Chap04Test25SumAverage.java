package chap04V2;

import java.util.Scanner;

public class Chap04Test25SumAverage {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("对整数进行加法运算。\n要相加多少个整数：");
		int n=stdIn.nextInt();
		
		int sum=0;
		for(int i=0; i<n; i++) {
			System.out.print("整数（以0结束）：");
			int t=stdIn.nextInt();
			if (t<=0) {
				break;
			}
			sum +=t;
		}
		System.out.println("合计值为" +sum+ "。");
		
		stdIn.close();
		
	}//main结束
}//类结束
