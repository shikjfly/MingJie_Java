package chap12;

public class TimeAccount {
	private String name;//账号名
	private String no;//账号
	private long balance;//可用余额
	private long timeBalance; //可用余额（定期存款）
	
	//构造函数
	TimeAccount(String n, String num, long z, long timeBalance) {
		// TODO Auto-generated constructor stub
		name = n;
		no = num;
		balance = z;
		this.timeBalance = timeBalance;
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
	//确认定期存款
	long getTimeBalance() {
		return timeBalance;
	}
//	存入k钱
	void deposit(long k) {
		balance += k;
	}
//	取出k钱
	void withdraw(long k) {
		balance -= k;
	}
	//解除定期存款，全部转为普通存款
	void cancel() {
		balance += timeBalance;
		timeBalance = 0;
	}
}
