package chap04;

import java.util.*;

public class Kazuate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������Ϸ��ʼ����\n���һ��10~99������");
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int no = rand.nextInt(90)+10;
		int x;
		do {
			System.out.println("�Ƕ����أ�");
			x = stdIn.nextInt();
			if (x>no) {
				System.out.println("��������ִ�Ӵ��");
			}else if (x<no) {
				System.out.println("���������СӴ��");
			}else {
				System.out.println("�ش���ȷ");
			}
		} while (x!=no);
	}

}
