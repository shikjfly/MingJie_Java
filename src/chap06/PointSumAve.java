package chap06;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������5��ѧ���ķ�����");
		int sum = 0;
		System.out.println("1�ŵķ�����");
		int a = stdIn.nextInt();
		sum += a;
		System.out.println("2�ŵķ�����");
		int b = stdIn.nextInt();
		sum += b;
		System.out.println("3�ŵķ�����");
		int c = stdIn.nextInt();
		sum += c;
		System.out.println("4�ŵķ�����");
		int e = stdIn.nextInt();
		sum += e;
		System.out.println("5�ŵķ�����");
		int d = stdIn.nextInt();
		sum += d;
		
		System.out.println("�ܷ�Ϊ"+sum+"�֡�");
		System.out.println("ƽ����Ϊ"+(double)sum/5+"�֡�");
	}

}
