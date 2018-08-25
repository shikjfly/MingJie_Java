package comthread;

public class MyData  {
	private int j=0;
	public synchronized void add() {
		j++;
		System.out.println("线程"+Thread.currentThread().getName()+" j为："+j);
	}
	public synchronized void set_data(int count) {
		j = count;
		System.out.println("线程"+Thread.currentThread().getName()+"j为："+j);
	}
}
