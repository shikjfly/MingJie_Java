package chap02;

import java.util.Random;
import java.util.Scanner;

public class LuckNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		int a = rand.nextInt(11);

		System.out.println("整数值：:" );
		Scanner stdInt = new Scanner(System.in);
		int b = stdInt.nextInt();

		System.out.println("生成了该值正负5范围内的随机数，是 " + (b+a-5) + "。");
	}

}
