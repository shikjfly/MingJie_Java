package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class PutAsterisk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();
		while (n>0) {
			System.out.print('*');
			n--;
		}
	}

}
