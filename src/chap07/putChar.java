package chap07;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class putChar {
	
	static void putChars(char c, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}
	static void putSquare(int n) {
		for (int i = 0; i < n; i++) {
			putChars('+', n);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("��ʾֱ�������·��������Ρ� ");  
		System.out.print("������ ");  int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			putChars(' ', n-i);
			putChars('X', i);
			System.out.println();
		}
		System.out.println("��ʾΪ�����Ρ�\n�߳�"); 
		int h = stdIn.nextInt();
		putSquare(h);
	

	}
}