package chap03;

import java.util.*;
public class Sort2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");  int a = stdIn.nextInt();
		System.out.println("整数b：");  int b = stdIn.nextInt();
		int min,max;
		
		if (a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;			
		}

		System.out.println("较大的值是："+max+"。");
		System.out.println("较小的值是："+min+"。");
	}
}
