package chap03;

import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数值：");
		int a = stdIn.nextInt();
		
		if(  a>0 ) {
			if(a%2 == 0) {
				System.out.println("输入的是偶数");	
			}else {
				System.out.println("输入的是奇数");	
			}
					
		}else {
			System.out.println("输入的不是正数。");	
		}

	}

}
