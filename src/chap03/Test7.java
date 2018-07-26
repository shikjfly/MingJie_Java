package chap03;

import java.util.*;

class Test7{
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("成绩：");
		int a = stdIn.nextInt();
		
		if(a>=0 && a<=59) {
			System.out.println("不及格");
		}else if (a>=60 && a<=69) {
			System.out.println("及格");
		}else if (a>=70 && a<=79) {
			System.out.println("良");
		}else if (a>=80 && a<=100) {
			System.out.println("优");
		}
	}
}
