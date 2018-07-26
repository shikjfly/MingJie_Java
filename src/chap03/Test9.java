package chap03;

import java.util.*;
public class Test9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("变量a：");  int a = stdIn.nextInt();
		System.out.println("变量b：");  int b = stdIn.nextInt();
		
		if (a<b) {
			System.out.println("较小的值："+a+"。");  
			System.out.println("较大的值："+b+"。"); 			
		}else if (a==b) {
			System.out.println("两个值相等。");  
		}else {
			System.out.println("较小的值："+b+"。");  
			System.out.println("较大的值："+a+"。"); 			
		}

	}
}
