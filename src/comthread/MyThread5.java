package comthread;
import java.util.Scanner;
public class MyThread5  {	
	public static void main(String[] args) {	
		final MyData d1 = new MyData();		
		Runnable run1 = new Runnable() {
			@Override
			public void run() {	
				while(true) {	//����ѭ������֤û�н���
					System.out.println("�߳�1�������飬���ǵȴ���1��,Ȼ��add������Ȼ�����뵱ǰ���ֵ�����̨");
					try {
						Thread.sleep(4000); //ÿ1������һ��
						d1.add();
					} catch (Exception e) {} //�쳣����
				}//while����
			}//run����
		};//Runnable����
		
		Runnable run2 = new Runnable() {
			@Override
			public void run() {	
				while(true) {			
					Scanner scan = new Scanner(System.in);
					System.out.println("�߳�2�������飬��������������Ƕ��٣�");
					int num = scan.nextInt(); // ѭ���ȴ���һ��
					d1.set_data(num);
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
