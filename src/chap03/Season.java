package chap03;

import java.util.*;
public class Season {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���㼾�ڡ�");
		System.out.println("�������·ݣ�");
		int a = stdIn.nextInt();
		
		if (a>=3 && a<=6) {
			System.out.println("���Ǵ��졣");
		} else if (a>=7 && a<=9) {
			System.out.println("�������졣");
		} else if (a>=10 && a<=12) {
			System.out.println("�������졣");
		} else if (a==1 || a==2 || a==3) {
			System.out.println("���Ƕ��졣");
		}else {
			System.out.println("��������");
		}
	}
		
}
