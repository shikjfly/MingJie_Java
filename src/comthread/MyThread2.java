package comthread;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("XXX重新写了run函数XX");
	}
	
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		
		Thread t1 = new Thread(mt);
		t1.start();
		System.out.println(t1.getId());

	}

}
