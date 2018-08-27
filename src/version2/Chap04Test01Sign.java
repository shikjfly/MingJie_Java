package version2;

import java.util.Scanner;

public class Chap04Test01Sign {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int retry;
		do {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (n>0) {
				System.out.println("该值为正");
			}else if (n == 0) {
				System.out.println("该值为0");
			}else {
				System.out.println("该值为负");
			}//if结束
			
			System.out.print("要重复一次吗？ 1---YES / 0---NO：");
			retry = stdIn.nextInt();
		} while (retry == 1);//do--while结束
		stdIn.close();
	}//main结束
}//类结束
