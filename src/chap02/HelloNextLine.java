package chap02;
import java.util.Scanner;;
public class HelloNextLine {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���������ǣ� ");
//		����һ�еĹ����У���������ո񣬿ո����Ҳ�����
		String s = stdIn.nextLine();

		System.out.println("���"+ s + " ������");
	}

}
