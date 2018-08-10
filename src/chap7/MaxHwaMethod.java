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
		int[] height = new int[3]; //身高
		int[] weight = new int[3]; //体重
		int[] age = new int[3]; //年龄
		for(int i=0; i<3; i++) {
			System.out.print("[" +i+ "]身高: ");
			height[i] = stdIn.nextInt();
			System.out.print("体重: ");
			weight[i] = stdIn.nextInt();
			System.out.print("年龄: ");
			age[i] = stdIn.nextInt();			
		}
//		计算身高最大值
//		int maxHeight = height[0];
//		if(height[1]>maxHeight)			maxHeight = height[1];
//		if(height[2]>maxHeight)			maxHeight = height[2];
////		计算身高最大值
//		int maxWeight = weight[0];
//		if(weight[1]>maxWeight)			maxWeight = weight[1];
//		if(weight[2]>maxWeight)			maxWeight = weight[2];
////		计算年龄最大值
//		int maxAge = age[0];
//		for(int i=1; i<3; i++) {
//			if (age[i]>maxAge) 			maxAge = age[i];
//		}
  		int maxHeight = max(height[0], height[1], height[2]);
  		int maxWeight = max(weight[0], weight[1], weight[2]);
  		int maxAge = max(age[0], age[1], age[2]);
  		
		System.out.println("身高的最大值为："+maxHeight);
		System.out.println("体重的最大值为："+maxWeight);
		System.out.println("年龄的最大值为："+maxAge);
	}
}