package chap05;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("整数： ");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.printf("十六进制: %x\n", a);
		System.out.printf("八进制: %o\n", a);
		System.out.printf("十进制: %d\n", a);

	}

}
