package chap08;

class Account2{
	//	String name;
	//	String no;
	//	long balance;
	private String name;
	private String no;
	private long balance;
	
	//���캯��
	Account2(String n, String num, long z) {
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
	long getBanlance() {
		return balance;
	}
//	��Ǯ
	void deposit(long k) {
		balance += k;
	}
//	ȡǮ
	void withdraw(long k) {
		balance -= k;
	}
	

}


public class AccountsClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 lis = new Account2("����", "1234", 1000);
		lis.withdraw(100);
		lis.deposit(200);
		System.out.println(lis.getBanlance());
	}

}
