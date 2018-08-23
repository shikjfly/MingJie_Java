package chap10;

class Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
//	¹¹Ôìº¯Êý
	public Account(String name, String no, long balace) {
		this.name = name;
		this.no = no;
		this.balance = balace;
		id = ++ counter;
	}
	public String getName() {		return name;	}
	public String getNo() {		return no;	}
	public long getBalance() {		return balance;	}
	public int getId() {		return id;	}
	public void deposit(long k) {		balance += k;	}
	public void withdraw(long k) {		balance -= k;	}
}
