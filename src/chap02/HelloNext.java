package chap02;
import java.util.Scanner;;
public class HelloNext {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("您的姓名是： ");
//		输入一行的过程中，不能输入空格，否则空格后面没法输出
		String s = stdIn.next();

		System.out.println("你好"+ s + " 先生。");
	}

}
