package chap04V2;

import java.util.Scanner;

public class Chap04Test15Test {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		System.out.print("从多少cm开始：");
		int star = stdIn.nextInt(); //开始
		System.out.print("从多少cm结束：");
		int end = stdIn.nextInt();//结束
		System.out.print("每次增量是多少cm：");
		int inc = stdIn.nextInt();//增量

		System.out.println("身高   标准体重");
		for (int i = star; i <= end; i+=inc) {
			System.out.println(i+"  "+(i-100)*0.9);
		}//for结束
		
		
		stdIn.close();
	}//main结束
}//类结束
