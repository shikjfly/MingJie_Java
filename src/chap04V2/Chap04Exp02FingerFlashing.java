package chap04V2;

import java.util.Scanner;

public class Chap04Exp02FingerFlashing {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int hand;
		do {
			System.out.print("��ѡ�����ƣ�0--ʯͷ / 1--���� / 2--������");
			hand = stdIn.nextInt();
			switch (hand) {		
				case 0:	System.out.println("ʯͷ");break;
				case 1:	System.out.println("����");break;
				case 2:	System.out.println("��"); break;
			}//switch����
			
		} while (hand!=0 && hand!=1 && hand!=2);//do--while����
		stdIn.close();
	}//main����
}//�����
