package chap04V2;

import java.util.Scanner;

public class Chap04Test06PutAsterisk {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����1����������з���");
		int n = stdIn.nextInt();

		while (n-- > 1) { //�����ڿɸ�дn��ֵ
			System.out.println();
		}//while����
		stdIn.close();
		
	}//main����
}//�����
