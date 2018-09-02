package version2;

import java.util.Scanner;

public class Chap04Exp17SumBreak1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("对整数进行加法运算。\n要相加多少个整数：");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			System.out.print("整数（以0结束）：");
			int t = stdIn.nextInt();
			if (t==0) {
				break;
			}//if结束
			sum += t;			
		}//for结束
		System.out.println("合计值："+sum);
		
		stdIn.close();
		
	}//main结束
}//类结束
