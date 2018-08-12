package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class PutAsteriskFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("要显示多少个*呢？");
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

}
