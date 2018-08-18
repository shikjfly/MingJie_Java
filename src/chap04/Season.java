package chap04;

import java.util.*;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("计算季节。\n请输入月份：");
			int month = stdIn.nextInt();
			
			if (month>=3 && month<=6) {
				System.out.println("这是春天。");
			} else if (month>=7 && month<=9) {
				System.out.println("这是夏天。");
			} else if (month>=10 && month<=12) {
				System.out.println("这是秋天。");
			} else if (month==1 || month==2 || month==3) {
				System.out.println("这是冬天。");
			}else {
				System.out.println("输入有误");
			}
			
			System.out.println("要重复一次么？ 1---YES、0----No");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}

}
