package chap08;

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car vitz = new Car("ޱ��", 1660, 1500, 3640, 40.0);
		Car march = new Car("���", 1660, 1525, 3695, 41.0);
		
		vitz.putSpec();
		System.out.println();
		march.putSpec();
	}

}
