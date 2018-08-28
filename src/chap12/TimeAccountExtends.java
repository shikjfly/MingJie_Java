package chap12;

public class TimeAccountExtends extends Account {
	private long timeBalance; //���������ڴ�
	
	//���캯��
	TimeAccountExtends(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	//ȷ�϶��ڴ��
	long getTimeBalance() {
		return timeBalance;
	}

	//������ڴ�ȫ��תΪ��ͨ���
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
