package version2;

import java.util.Random;
import java.util.Scanner;

public class Chap04Test03Test {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		
		System.out.print("����A��");
		int a = stdIn.nextInt();
		System.out.print("����B��");
		int b = stdIn.nextInt();
		int max = a;
		if ( b>max ) { max = b; }//if����
		int min = a;
		if ( b < min ) { min = b; }//if����
		do {
			System.out.print((min++) +" ");
		} while (max >= min);//do--while����

//		stdIn.close();
	}//main����
}//�����
