package comword;

public class Serial {
	//��ʽһ ��̬����
//	public static int serial = 0;
//	public static int getSerial() { //��ȡ���
//		Serial.serial += 1;
//		return Serial.serial;
//	}
	//��ʽ��������ģʽ
	private int serial = 0;
	private static Serial instance; //���������һ������
	static Serial getInstance() {
		if (instance == null) {
			instance = new Serial();			
		}
		return instance;
	}
	public int getSerial() {
		this.serial += 1;
		return this.serial;
	}
}
