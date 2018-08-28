package version2;

import java.util.Scanner;

public class Chap04Test07PutAsteriskPlus {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要显示多少个呢：");
		int n = stdIn.nextInt();
		int i = 0;
		while (n > i) { //适用于可改写n的值
			if (i%2 == 0) {
				System.out.print("*");
			}else {
				System.out.print("+");
			}//if结束
			i++;
		}//while结束
		System.out.println();
		stdIn.close();
		
	}//main结束
}//类结束
