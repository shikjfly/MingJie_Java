package chap08;

import java.util.Scanner;

public class CarTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// TODO Auto-generated method stub
		Car vitz = new Car("ޱ��", 1660, 1500, 3640, 40.0);
		Car march = new Car("���", 1660, 1525, 3695, 41.0);
		
		vitz.putSpec();
		while (true) {
			System.out.println("��ǰλ�ã�" +vitz.getX() + ", " + vitz.getY() + "),ʣ��ȼ�ϣ� "+ vitz.getFuel());
			System.out.println("�Ƿ��ƶ�[0...No/ 1...Yes]�� ");
			if (stdIn.nextInt() == 0)  break;
			
			System.out.println("X������ƶ����룺");
			double dx = stdIn.nextDouble();
			System.out.println("Y������ƶ����룺");
			double dy = stdIn.nextDouble();
			vitz.move(dx, dy);
			if (!vitz.move(dx, dy)) {
				System.out.println("ȼ�ϲ��㣡");
			}
		}
	}

}
