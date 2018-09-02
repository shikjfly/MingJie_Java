package version2;

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
		for(int i=2; i<n; i++) {
			if (n%i != 0) {
				System.out.println("非约数"+i);
			}else {
				break;
			}
		}//for结束
		System.out.println(n+"的约数个数：");
		
//		int x=0;
//		for(int i=1; i<=n; i++) {
//			if (n%i == 0) {
//				System.out.println(i);
//				x++;
//			}
//		}//for结束
//		System.out.println(n+"是约数，约数个数："+x);
			
		
		stdIn.close();
		
	}//main结束
}//类结束
