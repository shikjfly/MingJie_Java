package chap03;

import java.util.*;
public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数是：");
		int a = stdIn.nextInt();
		
		
		if(  !(a!=0)  ) {
			System.out.println("该值是0。");
		}else {
			System.out.println("该值不是0。");			
		}
	}

}
