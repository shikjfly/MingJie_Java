package version2;

import java.util.Scanner;

public class Chap04Test07PutAsteriskPlus {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Ҫ��ʾ���ٸ��أ�");
		int n = stdIn.nextInt();
		int i = 0;
		while (n > i) { //�����ڿɸ�дn��ֵ
			if (i%2 == 0) {
				System.out.print("*");
			}else {
				System.out.print("+");
			}//if����
			i++;
		}//while����
		System.out.println();
		stdIn.close();
		
	}//main����
}//�����
