package chap04V2;

import java.util.Scanner;

public class Chap04Test19Season {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int month;
		do {
			System.out.print("���㼾�ڡ�\n�������·ݣ�");
			month = stdIn.nextInt();
			
			if (month>=3 && month<=5) {
				System.out.println("���Ǵ��졣");
			}else if (month>=6 && month<=8) {
				System.out.println("�������졣");
			}else if (month>=9 && month<=11) {
				System.out.println("�������졣");
			}else if (month==12 || month==1 || month==2) {
				System.out.println("���Ƕ��졣");
			}else {
				System.out.println("����������\n");
			}
			
		} while (month < 1 || month > 12);//do--while����
		stdIn.close();
	}//main����
}//�����
