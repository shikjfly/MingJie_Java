package chap08;

class Account2{
	//	String name;
	//	String no;
	//	long balance;
	private String name;
	private String no;
	private long balance;
	
	//构造函数
	Account2(String n, String num, long z) {
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
	long getBanlance() {
		return balance;
	}
//	存钱
	void deposit(long k) {
		balance += k;
	}
//	取钱
	void withdraw(long k) {
		balance -= k;
	}
	

}


public class AccountsClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 lis = new Account2("李四", "1234", 1000);
		lis.withdraw(100);
		lis.deposit(200);
		System.out.println(lis.getBanlance());
	}

}
