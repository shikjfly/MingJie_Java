package chap04V2;

import java.util.Scanner;

public class Chap04Exp01Season {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int retry;
		do {
			System.out.print("���㼾�ڡ�\n�������·ݣ�");
			int month = stdIn.nextInt();
			switch (month) {
			case 3:		
			case 4:		
			case 5:
				System.out.println("���Ǵ��졣");
				break;
			case 6:		
			case 7:		
			case 8:
				System.out.println("�������졣"); 
				break;
			case 9:	
			case 10:	
			case 11:
				System.out.println("�������졣"); 
				break;
			case 12:	
			case 1:	
			case 2:
				System.out.println("���Ƕ��졣"); 
				break;
			default:
				System.out.println("��������ȷ������");	break;
			}//switch����
			
			System.out.print("Ҫ�ظ�һ���� 1---YES / 0---NO��");
			retry = stdIn.nextInt();
		} while (retry == 1);//do--while����
		stdIn.close();
	}//main����
}//�����
