package chap02;
import java.util.Scanner;;
public class HelloNextLine {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("您的姓名是： ");
//		输入一行的过程中，可以输入空格，空格后面也会输出
		String s = stdIn.nextLine();

		System.out.println("你好"+ s + " 先生。");
	}

}
