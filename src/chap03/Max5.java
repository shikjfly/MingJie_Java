package chap03;

import java.util.*;
public class Max5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("整数a：");  int a = stdIn.nextInt();
		System.out.println("整数b：");  int b = stdIn.nextInt();
		System.out.println("整数c：");  int c = stdIn.nextInt();
		int min = a;
		if (b<min) {
			min = b;
		}  
		if (c<min) {
			min = c;
		}
		
		int max = a;
		if (b>max) {
			max = b;
		}  
		if (c>max) {
			max = c;
		}
		
		int mid = a;
		if (a>min && a<max) {
			mid = a;
		}
		if (b>min && b<max) {
			mid = b;
		}
		if (c>min && c<max) {
			mid = c;
		}
		
		System.out.println("中间值是："+mid+"。");
	}
}
