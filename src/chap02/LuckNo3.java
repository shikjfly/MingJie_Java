package chap02;

import java.util.Random;
import java.util.Scanner;

public class LuckNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		int a = rand.nextInt(11);

		System.out.println("����ֵ��:" );
		Scanner stdInt = new Scanner(System.in);
		int b = stdInt.nextInt();

		System.out.println("�����˸�ֵ����5��Χ�ڵ���������� " + (b+a-5) + "��");
	}

}
