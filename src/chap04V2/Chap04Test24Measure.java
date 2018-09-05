package chap04V2;

import java.util.Scanner;

public class Chap04Test24Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("正整数值：");
			n = stdIn.nextInt();
		} while (n<=0);//do...while结束
		
		int x=0;
		for (int i = 1; i <=n; i++) {
			if (n%i == 0) {
				System.out.println(i);
				x++;
			} //if结束
		} //for结束
		System.out.println("...以上个数："+x+"个");

		Boolean flag = true; // ture是质数
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				flag = false;//因为可以整除，所以是约数
				break;
			}//if结束	
		}//for结束
		
		if (flag) {
			System.out.println(n+"是质数。");
		}else {
			System.out.println(n+"是约数。");
		}//if结束
				
		stdIn.close();
		
	}//main结束
}//类结束
