package chap04V2;

import java.util.Scanner;

public class Chap04Exp187SumBreak2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("对整数进行加法运算。\n要相加多少个整数：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			sum += t;
			if (sum>=1000) {
				System.out.println("合计值超过了1000。");
				System.out.println("最后一个数值被忽略。");
				sum -= t;
				break;
			}//if结束
		}//for结束
		System.out.println("合计值为"+sum+"。");
		
		stdIn.close();
		
	}//main结束
}//类结束
