package version2;

import java.util.Scanner;

public class Chap04Test24Measure {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("������ֵ��");
			n = stdIn.nextInt();
		} while (n<=0);//do...while����

		int x=0;
		for(int i=2; i<n; i++) {
			if (n%i != 0) {
				System.out.println("��Լ��"+i);
			}else {
				break;
			}
		}//for����
		System.out.println(n+"��Լ��������");
		
//		int x=0;
//		for(int i=1; i<=n; i++) {
//			if (n%i == 0) {
//				System.out.println(i);
//				x++;
//			}
//		}//for����
//		System.out.println(n+"��Լ����Լ��������"+x);
			
		
		stdIn.close();
		
	}//main����
}//�����
