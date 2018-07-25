package chap03;

import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数值：");
		int a = stdIn.nextInt();
		
		
		if(  a<0  ) {
			a = -a;
		}

		System.out.println("其绝对值是"+a+"。");
	}

}
