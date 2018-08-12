package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数A：");
		int A = stdIn.nextInt();
		System.out.println("整数B：");
		int B = stdIn.nextInt();
		if (A>B) {
			do {
				System.out.print(B+" ");
				B++;
			} while (B != (A+1));
		}else {
			do {
				System.out.print(A+ " ");
				A++;
			} while (A != (B+1));
		}
	
	}

}
