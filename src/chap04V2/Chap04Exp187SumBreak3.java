package chap04V2;

import java.util.Scanner;

public class Chap04Exp187SumBreak3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("对整数进行加法运算。\n要相加多少个整数：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();

			if (t<0) {
				System.out.println("不对负数进行加法运算。");
				continue;
			}//if结束
			sum += t; //当t<0时，不执行
		}//for结束
		System.out.println("合计值为"+sum+"。");
		
		stdIn.close();
		
	}//main结束
}//类结束
