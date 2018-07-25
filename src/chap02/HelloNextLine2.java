package chap02;
import java.util.Scanner;;
public class HelloNextLine2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		

		
		System.out.println("姓： ");
		String a = stdIn.next();
		
		System.out.println("名： ");
		String b = stdIn.next();
		
		System.out.println("你好"+a+b+ "先生。");
	}

}
