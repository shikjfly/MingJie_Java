package chap12;

public class Account {
	private String name;//�˺���
	private String no;//�˺�
	private long balance;//�������

	
	//���캯��
	Account(String n, String num, long z) {
		// TODO Auto-generated constructor stub
		name = n;
		no = num;
		balance = z;

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

//	����kǮ
	void deposit(long k) {
		balance += k;
	}
//	ȡ��kǮ
	void withdraw(long k) {
		balance -= k;
	}
}
