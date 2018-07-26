package chap03;

import java.util.*;
public class Max6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");  int a = stdIn.nextInt();
		System.out.println("整数b：");  int b = stdIn.nextInt();
		System.out.println("整数c：");  int c = stdIn.nextInt();
		
		int avg = (a+b+c)/3;
		
		
		System.out.println("中间值是："+avg+"。");
	}
}
