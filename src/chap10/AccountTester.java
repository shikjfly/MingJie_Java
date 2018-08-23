package chap10;

class AccountTester {
	
	public static void main(String[] args) {
		
		Account[] a = {
				new Account("Zhans", "123456", 1000),
				new Account("lis", "65431", 200),
				new Account("liw", "654321", 200)
		};
		
		System.out.println(  a[2].getId()  );
		
	}
		
}
