package comthread;

import java.util.Scanner;

public class MyThread4  {

	public static void main(String[] args) {

		Runnable run1 = new Runnable() {
			int count = 0;
			@Override
			public void run() {	
				while(true) {	//����ѭ������֤û�н���
					try {
						Thread.sleep(4000); //��ͣ1��
					} catch (Exception e) {} //�쳣����
					System.out.println("�߳�1�������飬���ǵȴ���4�룬Ȼ�����뵱ǰ���ֵ�����̨");
				}//while����
			}//run����
		};//Runnable����
		Runnable run2 = new Runnable() {
			int count = 0;
			@Override
			public void run() {	
				while(true) {			
					Scanner scan = new Scanner(System.in);
					System.out.println("�߳�2�������飬��������������Ƕ��٣�����</br>");
					int num = scan.nextInt(); // ѭ���ȴ���һ��
					System.out.println("����������Ƕ��٣�"+ num);
				}//while����
			}//run����
		};//Runnable����

		Thread t1 = new Thread(run1);
		t1.start();
		Thread t2 = new Thread(run2);
		t2.start();

		

	}

}
