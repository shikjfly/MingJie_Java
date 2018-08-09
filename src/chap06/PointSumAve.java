package chap06;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("请输入5名学生的分数。");
		int sum = 0;
		System.out.println("1号的分数：");
		int a = stdIn.nextInt();
		sum += a;
		System.out.println("2号的分数：");
		int b = stdIn.nextInt();
		sum += b;
		System.out.println("3号的分数：");
		int c = stdIn.nextInt();
		sum += c;
		System.out.println("4号的分数：");
		int e = stdIn.nextInt();
		sum += e;
		System.out.println("5号的分数：");
		int d = stdIn.nextInt();
		sum += d;
		
		System.out.println("总分为"+sum+"分。");
		System.out.println("平均分为"+(double)sum/5+"分。");
	}

}
