package comword;

public class Serial {
	//方式一 静态方法
//	public static int serial = 0;
//	public static int getSerial() { //获取编号
//		Serial.serial += 1;
//		return Serial.serial;
//	}
	//方式二：单例模式
	private int serial = 0;
	private static Serial instance; //生成自身的一个对象
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
