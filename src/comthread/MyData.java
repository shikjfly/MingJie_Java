package comthread;

public class MyData  {
	private int j=0;
	public synchronized void add() {
		j++;
		System.out.println("�߳�"+Thread.currentThread().getName()+" jΪ��"+j);
	}
	public synchronized void set_data(int count) {
		j = count;
		System.out.println("�߳�"+Thread.currentThread().getName()+"jΪ��"+j);
	}
}
