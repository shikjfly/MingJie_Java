package chap7;

public class Scope {
	
	static int x = 700;
	
	static void printX() {
		System.out.println("printX: "+x);
	}
	
	public static void main(String[] args) {
		System.out.println("mainIniX: "+x);
		
		int x=900;
		System.out.println("mainAfterX: "+x);
		
		System.out.println("ScopeX: " + Scope.x);
		
		printX();
	}
	
}
