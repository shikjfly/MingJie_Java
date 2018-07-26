package chap03;

import java.util.*;

class Test8{
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");
		int a = stdIn.nextInt();
		System.out.println("整数b：");
		int b = stdIn.nextInt();
		
		int dif = a>b ? a-b : b-a ;
		
		System.out.println("差值："+ dif+"。");
	}
}
