package chap02;
import java.util.Scanner;;
public class HelloNext {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������ǣ� ");
//		����һ�еĹ����У���������ո񣬷���ո����û�����
		String s = stdIn.next();

		System.out.println("���"+ s + " ������");
	}

}
