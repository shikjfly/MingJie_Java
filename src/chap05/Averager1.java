package chap05;

import java.util.*;

public class Averager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("计算整数值x和y的平均值。");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("x的值： ");
		int x = stdIn.nextInt();
		
		System.out.println("y的值： ");
		int y = stdIn.nextInt();
		
		double ave = (x+y)/2;
		System.out.println("x和y的平均值为" + ave + "。");
	}

}
