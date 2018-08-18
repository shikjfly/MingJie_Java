package chap08;

import java.util.Scanner;

public class CarTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// TODO Auto-generated method stub
		Car vitz = new Car("薇姿", 1660, 1500, 3640, 40.0);
		Car march = new Car("玛驰", 1660, 1525, 3695, 41.0);
		
		vitz.putSpec();
		while (true) {
			System.out.println("当前位置（" +vitz.getX() + ", " + vitz.getY() + "),剩余燃料： "+ vitz.getFuel());
			System.out.println("是否移动[0...No/ 1...Yes]： ");
			if (stdIn.nextInt() == 0)  break;
			
			System.out.println("X方向的移动距离：");
			double dx = stdIn.nextDouble();
			System.out.println("Y方向的移动距离：");
			double dy = stdIn.nextDouble();
			vitz.move(dx, dy);
			if (!vitz.move(dx, dy)) {
				System.out.println("燃料不足！");
			}
		}
	}

}
