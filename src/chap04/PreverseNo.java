package chap04;

import java.util.*;

public class PreverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("逆序显示正整数值。");
		int n = -1;
		while (n<0) {
			System.out.println("正整数值：");
			n = stdIn.nextInt();
		}
		System.out.println("倒过来读是：");
		while (n>0) {
			System.out.print(n%10);
			n = n/10;
		}		
	}
}
