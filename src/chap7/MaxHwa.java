package chap7;

import java.util.Scanner;

public class MaxHwa {

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
		int maxHeight = height[0];
		if(height[1]>maxHeight)			maxHeight = height[1];
		if(height[2]>maxHeight)			maxHeight = height[2];
//		����������ֵ
		int maxWeight = weight[0];
		if(weight[1]>maxWeight)			maxWeight = weight[1];
		if(weight[2]>maxWeight)			maxWeight = weight[2];
//		�����������ֵ
		int maxAge = age[0];
		for(int i=1; i<3; i++) {
			if (age[i]>maxAge) 			maxAge = age[i];
		}
		System.out.println("��ߵ����ֵΪ��"+maxHeight);
		System.out.println("���ص����ֵΪ��"+maxWeight);
		System.out.println("��������ֵΪ��"+maxAge);
	}
}