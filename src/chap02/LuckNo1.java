package chap02;

import java.util.Random;

public class LuckNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int lucky = rand.nextInt(9);
		System.out.println("���������������" + (lucky+1) + "��");
		System.out.println("���������������" + (-lucky-1) + "��");

	}

}
