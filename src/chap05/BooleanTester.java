package chap05;

import java.util.*;

public class BooleanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a： ");
		int a = stdIn.nextInt();
		
		System.out.println("整数b： ");
		int b = stdIn.nextInt();

		System.out.println(a+ "<" + b +" : "+ (a<b));
		System.out.println(a+ "<=" + b +" : "+ (a<=b));
		System.out.println(a+ ">" + b +" : "+ (a>b));
		System.out.println(a+ ">=" + b +" : "+ (a>=b));
		System.out.println(a+ "=" + b +" : "+ (a==b));
		System.out.println(a+ "!=" + b +" : "+ (a!=b));
		System.out.println("!("+ a +"==0)"+" : "+ !(a==0));
		System.out.println("!("+ b +"==0)"+" : "+ !(b==0));

	}

}
