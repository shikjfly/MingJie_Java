package chap7;

import java.util.Scanner;

public class MaxHwaMethod {
	
	static int max(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[3]; //���
		int[] weight = new int[3]; //����
		int[] age = new int[3]; //����
		for(int i=0; i<3; i++) {
			System.out.print("[" +i+ "]���: ");
			height[i] = stdIn.nextInt();
			System.out.print("����: ");
			weight[i] = stdIn.nextInt();
			System.out.print("����: ");
			age[i] = stdIn.nextInt();			
		}
//		����������ֵ
//		int maxHeight = height[0];
//		if(height[1]>maxHeight)			maxHeight = height[1];
//		if(height[2]>maxHeight)			maxHeight = height[2];
////		����������ֵ
//		int maxWeight = weight[0];
//		if(weight[1]>maxWeight)			maxWeight = weight[1];
//		if(weight[2]>maxWeight)			maxWeight = weight[2];
////		�����������ֵ
//		int maxAge = age[0];
//		for(int i=1; i<3; i++) {
//			if (age[i]>maxAge) 			maxAge = age[i];
//		}
  		int maxHeight = max(height[0], height[1], height[2]);
  		int maxWeight = max(weight[0], weight[1], weight[2]);
  		int maxAge = max(age[0], age[1], age[2]);
  		
		System.out.println("��ߵ����ֵΪ��"+maxHeight);
		System.out.println("���ص����ֵΪ��"+maxWeight);
		System.out.println("��������ֵΪ��"+maxAge);
	}
}