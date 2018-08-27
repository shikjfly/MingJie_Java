package version2;

import java.util.Random;
import java.util.Scanner;

public class Chap04Test02Kazuate {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		Random rand = new Random();
		
		int no = rand.nextInt(90) + 10; //10-99个数字
		
		System.out.println(no);
		System.out.print("猜数字游戏开始！！ \n请猜一个10~99的数字。");
		
		int x;
		do {
			System.out.print("是多少呢：");
			x = stdIn.nextInt();
			if (x > no) {
				System.out.println("猜的数字比目标数字大哟");
			}else if (x < no) {
				System.out.println("猜的数字比目标数字小哟");
			}	
		} while (x != no);//do--while结束
		
		System.out.println("回答正确");
		stdIn.close();
	}//main结束
}//类结束
