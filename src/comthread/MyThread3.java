package comthread;

public class MyThread3  {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {	System.out.println("����д��run����X");}
		};
		Thread t = new Thread(r);
		t.start();

	}

}
