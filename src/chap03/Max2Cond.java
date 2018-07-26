package chap03;

import java.util.*;
public class Max2Cond {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");
		int a = stdIn.nextInt();
		System.out.println("整数b：");
		int b = stdIn.nextInt();
		
		System.out.println("较小的值是："+ (a>b?b:a)+"。");
	}
}
