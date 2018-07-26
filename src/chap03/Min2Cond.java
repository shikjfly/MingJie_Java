package chap03;

import java.util.*;
public class Min2Cond {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");
		int a = stdIn.nextInt();
		System.out.println("整数b：");
		int b = stdIn.nextInt();
		
		int max = a<b ? b : a ;
		
		System.out.println("较大的值是："+ max+"。");
	}
}
