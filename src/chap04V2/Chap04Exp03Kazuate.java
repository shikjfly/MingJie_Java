package chap04V2;

import java.util.Random;
import java.util.Scanner;

public class Chap04Exp03Kazuate {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		Random rand = new Random();
		
		int no = rand.nextInt(100); //0-99������
		
		System.out.println(no);
		System.out.print("��������Ϸ��ʼ���� \n���һ��0~99�����֡�");
		
		int x;
		do {
			System.out.print("�Ƕ����أ�");
			x = stdIn.nextInt();
			if (x > no) {
				System.out.println("�µ����ֱ�Ŀ�����ִ�Ӵ");
			}else if (x < no) {
				System.out.println("�µ����ֱ�Ŀ������СӴ");
			}	
		} while (x != no);//do--while����
		
		System.out.println("�ش���ȷ");
		stdIn.close();
	}//main����
}//�����
