package chap04;

import java.util.*;

public class PutAsterisk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Ҫ��ʾ���ٸ�*�أ�");
		int n = stdIn.nextInt();
		int i=1;
		while (n>=i) {
			if (i%2==1) {
				System.out.print('*');
			}else {
				System.out.print('+');
			}
			i++;
		}
	}

}
