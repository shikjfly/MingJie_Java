package chap12;

public class Account {
	private String name;//账号名
	private String no;//账号
	private long balance;//可用余额

	
	//构造函数
	Account(String n, String num, long z) {
		// TODO Auto-generated constructor stub
		name = n;
		no = num;
		balance = z;

	}
	//确认账户名
	String getName() {
		return name;
	}
	//确认账号
	String getNo() {
		return no;
	}
	//确认余额
	long getBalance() {
		return balance;
	}

//	存入k钱
	void deposit(long k) {
		balance += k;
	}
//	取出k钱
	void withdraw(long k) {
		balance -= k;
	}
}
