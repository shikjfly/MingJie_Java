package chap7;

import java.util.Scanner;

public class putStars {
	
	static void putStars(int n) {

		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("��ʾֱ�������·��������Ρ� ");  
		System.out.print("������ ");  int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			putStars(i);	
			System.out.println();
		}
		
		

	}
}