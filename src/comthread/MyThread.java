package comthread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("����д��run����");
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		System.out.println(mt.getId());
	}

}
