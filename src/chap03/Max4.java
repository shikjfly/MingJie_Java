package chap03;

import java.util.*;
public class Max4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����a��");  int a = stdIn.nextInt();
		System.out.println("����b��");  int b = stdIn.nextInt();
		System.out.println("����c��");  int c = stdIn.nextInt();
		int min = a;
		if (b<min) {
			min = b;
		}  
		if (c<min) {
			min = c;
		}

		System.out.println("��С��ֵ�ǣ�"+min+"��");
	}
}
