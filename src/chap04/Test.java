package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("整数值：");
			int n = stdIn.nextInt();
			if (n>0) {
				System.out.println("该值为正");
			}else if (n==0) {
				System.out.println("该值为0");
			}else {
				System.out.println("该值为负");
			}
			System.out.println("是否要再玩一次，1--YES; 0---No");
			retry = stdIn.nextInt();
		} while (retry ==1);
		
	}

}
