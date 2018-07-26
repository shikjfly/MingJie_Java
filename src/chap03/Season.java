package chap03;

import java.util.*;
public class Season {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("计算季节。");
		System.out.println("请输入月份：");
		int a = stdIn.nextInt();
		
		if (a>=3 && a<=6) {
			System.out.println("这是春天。");
		} else if (a>=7 && a<=9) {
			System.out.println("这是夏天。");
		} else if (a>=10 && a<=12) {
			System.out.println("这是秋天。");
		} else if (a==1 || a==2 || a==3) {
			System.out.println("这是冬天。");
		}else {
			System.out.println("输入有误");
		}
	}
		
}
