package chap06;

import java.util.Scanner;

public class IntArrayScan {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ÔªËØ¸öÊý£º");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
		
	}

}
