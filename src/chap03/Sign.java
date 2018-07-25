package chap03;

import java.util.*;
public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数是：");
		int a = stdIn.nextInt();
		
		
		if(  a>0  ) {
			System.out.println("该值大于0。");
		}else if(a<0){
			System.out.println("该值小于0。");			
		}else{
			System.out.println("该值等于0。");			
		}
	}

}
