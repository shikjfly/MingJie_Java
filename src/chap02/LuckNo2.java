package chap02;

import java.util.Random;

public class LuckNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		
		System.out.println("随机生成10-99的值" + a + b + "。");

	}

}
