package chap04V2;

import java.util.Scanner;

public class Chap04Exp01Season {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);	
		int retry;
		do {
			System.out.print("计算季节。\n请输入月份：");
			int month = stdIn.nextInt();
			switch (month) {
			case 3:		
			case 4:		
			case 5:
				System.out.println("这是春天。");
				break;
			case 6:		
			case 7:		
			case 8:
				System.out.println("这是夏天。"); 
				break;
			case 9:	
			case 10:	
			case 11:
				System.out.println("这是秋天。"); 
				break;
			case 12:	
			case 1:	
			case 2:
				System.out.println("这是冬天。"); 
				break;
			default:
				System.out.println("请输入正确的数字");	break;
			}//switch结束
			
			System.out.print("要重复一次吗？ 1---YES / 0---NO：");
			retry = stdIn.nextInt();
		} while (retry == 1);//do--while结束
		stdIn.close();
	}//main结束
}//类结束
