package chap03;

import java.util.*;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数a：");
		int a = stdIn.nextInt();
		
		System.out.println("整数b：");
		int b = stdIn.nextInt();
		
		if(a==b) {
			System.out.println("两个值相等。");
		}else {
			System.out.println("两个值不相等。");			
		}
	}

}
