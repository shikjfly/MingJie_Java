package comthread;
import java.util.Scanner;
public class MyThread5  {	
	public static void main(String[] args) {	
		final MyData d1 = new MyData();		
		Runnable run1 = new Runnable() {
			@Override
			public void run() {	
				while(true) {	//不断循环，保证没有结束
					System.out.println("线程1做的事情，就是等待了1秒,然后add方法，然后输入当前文字到控制台");
					try {
						Thread.sleep(4000); //每1秒运行一次
						d1.add();
					} catch (Exception e) {} //异常处理
				}//while结束
			}//run结束
		};//Runnable结束
		
		Runnable run2 = new Runnable() {
			@Override
			public void run() {	
				while(true) {			
					Scanner scan = new Scanner(System.in);
					System.out.println("线程2做的事情，就是输入的数字是多少：");
					int num = scan.nextInt(); // 循环等待下一个
					d1.set_data(num);
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
