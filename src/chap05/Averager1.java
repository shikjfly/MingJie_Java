package chap05;

import java.util.*;

public class Averager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������ֵx��y��ƽ��ֵ��");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("x��ֵ�� ");
		int x = stdIn.nextInt();
		
		System.out.println("y��ֵ�� ");
		int y = stdIn.nextInt();
		
		double ave = (x+y)/2;
		System.out.println("x��y��ƽ��ֵΪ" + ave + "��");
	}

}
