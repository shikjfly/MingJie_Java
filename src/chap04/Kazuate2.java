package chap04;

import java.util.*;

public class Kazuate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("猜数字游戏开始！！\n请猜一个10~99的数字");
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int no = rand.nextInt(90)+10;
		int x;
		do {
			System.out.println("是多少呢：");
			x = stdIn.nextInt();
			if (x>no) {
				System.out.println("比这个数字大哟。");
			}else if (x<no) {
				System.out.println("比这个数字小哟。");
			}else {
				System.out.println("回答正确");
			}
		} while (x!=no);
	}

}
