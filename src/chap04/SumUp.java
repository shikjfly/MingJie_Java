package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class SumUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("计算1到n的和。\nn的值：");
		int n = stdIn.nextInt();
		int b=n;
		int sum=0;
		while (n>0) {
			sum += n;
			n--;
		}
		System.out.println("1到"+b+"的和是"+sum+"。");
	}
}
