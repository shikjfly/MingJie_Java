package version2;

import java.util.Scanner;

public class Chap04Test14SumUp {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.println("����1��n�ĺ͡�");

		int n = -1;
		for ( ;  n < 0; ) {
			System.out.print("n��ֵ��");
			n = stdIn.nextInt();
		}//for����
		
		int sum=0;
		String k = null ;
		for(int i=1 ;  i <= n;  i++) {
			System.out.println(i);
			sum += i;
			k += i+ "+";
			System.out.println(k);
		}//for����


		System.out.println("1��"+n+"�ĺ���"+sum+"��");
		
		stdIn.close();
	}//main����
}//�����
