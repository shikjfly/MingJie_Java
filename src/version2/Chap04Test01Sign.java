package version2;

import java.util.Scanner;

public class Chap04Test01Sign {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int retry;
		do {
			System.out.print("����ֵ��");
			int n = stdIn.nextInt();
			if (n>0) {
				System.out.println("��ֵΪ��");
			}else if (n == 0) {
				System.out.println("��ֵΪ0");
			}else {
				System.out.println("��ֵΪ��");
			}//if����
			
			System.out.print("Ҫ�ظ�һ���� 1---YES / 0---NO��");
			retry = stdIn.nextInt();
		} while (retry == 1);//do--while����
		stdIn.close();
	}//main����
}//�����
