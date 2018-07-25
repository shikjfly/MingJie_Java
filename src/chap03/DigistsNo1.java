package chap03;

import java.util.*;

class DigistsNo1{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a的值：");
		int a = stdIn.nextInt();
		
		if(a==0) {
			System.out.println("输入的0。");
		}else if(a>=-9 && a<=9){
			System.out.println("输入的是一位数。");
		}else{
			System.out.println("输入的是两位数及以上。");
		}
	}
}
