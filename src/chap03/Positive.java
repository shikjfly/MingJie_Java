package chap03;

import java.util.*;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数是：");
		int n = stdIn.nextInt();
		
		if(n>0) {
			System.out.println("该值为正。");
		}
	}

}
