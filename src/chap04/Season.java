package chap04;

import java.util.*;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("���㼾�ڡ�\n�������·ݣ�");
			int month = stdIn.nextInt();
			
			if (month>=3 && month<=6) {
				System.out.println("���Ǵ��졣");
			} else if (month>=7 && month<=9) {
				System.out.println("�������졣");
			} else if (month>=10 && month<=12) {
				System.out.println("�������졣");
			} else if (month==1 || month==2 || month==3) {
				System.out.println("���Ƕ��졣");
			}else {
				System.out.println("��������");
			}
			
			System.out.println("Ҫ�ظ�һ��ô�� 1---YES��0----No");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}

}
