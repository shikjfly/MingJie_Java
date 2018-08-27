package version2;

import java.util.Random;
import java.util.Scanner;

public class Chap04Test03Test {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		
		System.out.print("整数A：");
		int a = stdIn.nextInt();
		System.out.print("整数B：");
		int b = stdIn.nextInt();
		int max = a;
		if ( b>max ) { max = b; }//if结束
		int min = a;
		if ( b < min ) { min = b; }//if结束
		do {
			System.out.print((min++) +" ");
		} while (max >= min);//do--while结束

//		stdIn.close();
	}//main结束
}//类结束
