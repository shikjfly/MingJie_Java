package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ÕûÊıÖµ£º");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
