package chap12;

public class TimeAccountExtends extends Account {
	private long timeBalance; //可用余额（定期存款）
	
	//构造函数
	TimeAccountExtends(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	//确认定期存款
	long getTimeBalance() {
		return timeBalance;
	}

	//解除定期存款，全部转为普通存款
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
