package chap04V2;

import java.util.Scanner;

public class Chap04Exp01Season1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int retry;
		do {
			System.out.print("���㼾�ڡ�\n�������·ݣ�");
			int month = stdIn.nextInt();
			if (month>=3 && month<=5) {
				System.out.println("���Ǵ��졣");
			}else if (month>=6 && month<=8) {
				System.out.println("�������졣");
			}else if (month>=9 && month<=11) {
				System.out.println("�������졣");
			}else if (month==12 || month==1 || month==2) {
				System.out.println("���Ƕ��졣");
			}//if����
			
			System.out.print("Ҫ�ظ�һ���� 1---YES / 0---NO��");
			retry = stdIn.nextInt();
		} while (retry == 1);//do--while����
		stdIn.close();
	}//main����
}//�����
