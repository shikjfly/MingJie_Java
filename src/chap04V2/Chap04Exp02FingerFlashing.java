package chap04V2;

import java.util.Scanner;

public class Chap04Exp02FingerFlashing {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int hand;
		do {
			System.out.print("请选择手势（0--石头 / 1--剪刀 / 2--布）：");
			hand = stdIn.nextInt();
			switch (hand) {		
				case 0:	System.out.println("石头");break;
				case 1:	System.out.println("剪刀");break;
				case 2:	System.out.println("布"); break;
			}//switch结束
			
		} while (hand!=0 && hand!=1 && hand!=2);//do--while结束
		stdIn.close();
	}//main结束
}//类结束
