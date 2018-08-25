package comthread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("重新写了run函数");
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		System.out.println(mt.getId());
	}

}
