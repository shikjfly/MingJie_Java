package comthread;

import java.util.Scanner;

public class MyThread4  {

	public static void main(String[] args) {

		Runnable run1 = new Runnable() {
			int count = 0;
			@Override
			public void run() {	
				while(true) {	//不断循环，保证没有结束
					try {
						Thread.sleep(4000); //暂停1秒
					} catch (Exception e) {} //异常处理
					System.out.println("线程1做的事情，就是等待了4秒，然后输入当前文字到控制台");
				}//while结束
			}//run结束
		};//Runnable结束
		Runnable run2 = new Runnable() {
			int count = 0;
			@Override
			public void run() {	
				while(true) {			
					Scanner scan = new Scanner(System.in);
					System.out.println("线程2做的事情，就是输入的数字是多少：《》</br>");
					int num = scan.nextInt(); // 循环等待下一个
					System.out.println("输入的数字是多少："+ num);
				}//while结束
			}//run结束
		};//Runnable结束

		Thread t1 = new Thread(run1);
		t1.start();
		Thread t2 = new Thread(run2);
		t2.start();

		

	}

}
