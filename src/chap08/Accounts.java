package chap08;

public class Accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zhName = "张三";
		String zhAccount = "12345";
		long zhAccountBalance = 1000; 
		
		String liName = "李四";
		String liAccount = "123457";
		long liAccountBalance = 200; 
		
		zhAccountBalance -= 200;
		liAccountBalance += 100;
		
		System.out.println(zhAccountBalance);
		System.out.println(liAccountBalance);

	}

}
