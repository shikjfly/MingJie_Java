package chap03;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("����A��");
		int a = stdIn.nextInt();
		System.out.println("����B��");
		int b = stdIn.nextInt();
		
		
		if(  (a%b)==0  ) {
			System.out.println("B��A��Լ��");			
		}else {
			System.out.println("B����A��Լ��");	
		}

	}

}
