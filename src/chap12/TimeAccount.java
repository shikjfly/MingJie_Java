package chap12;

public class TimeAccount {
	private String name;//�˺���
	private String no;//�˺�
	private long balance;//�������
	private long timeBalance; //���������ڴ�
	
	//���캯��
	TimeAccount(String n, String num, long z, long timeBalance) {
		// TODO Auto-generated constructor stub
		name = n;
		no = num;
		balance = z;
		this.timeBalance = timeBalance;
	}
	//ȷ���˻���
	String getName() {
		return name;
	}
	//ȷ���˺�
	String getNo() {
		return no;
	}
	//ȷ�����
	long getBalance() {
		return balance;
	}
	//ȷ�϶��ڴ��
	long getTimeBalance() {
		return timeBalance;
	}
//	����kǮ
	void deposit(long k) {
		balance += k;
	}
//	ȡ��kǮ
	void withdraw(long k) {
		balance -= k;
	}
	//������ڴ�ȫ��תΪ��ͨ���
	void cancel() {
		balance += timeBalance;
		timeBalance = 0;
	}
}
