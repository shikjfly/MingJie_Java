package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class SumUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("����1��n�ĺ͡�\nn��ֵ��");
		int n = stdIn.nextInt();

		int sum=0;
		int i=1;
		while (n>=i) {
			sum += i;
			i++;
		}
		System.out.println("1��"+n+"�ĺ���"+sum+"��");
	}
}
