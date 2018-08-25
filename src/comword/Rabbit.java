package comword;

public class Rabbit implements IAnimal {
//	int mySerial = Serial.getSerial();
	int mySerial = Serial.getInstance().getSerial();
	int lifeState = 1;
	int lifeValue = 0;
	
	@Override
	public int getState() {
		return lifeState;
	}

	@Override
	public void grow() {
		if (lifeState == 1) {//1表示兔子还活着
			lifeValue =lifeValue + 1;//长了一岁
			if (lifeValue<=3) {	System.out.println("兔子"+mySerial+"现在"+lifeValue+"岁，还是个孩子"); }
			else if (lifeValue<=12) {System.out.println("兔子"+mySerial+"现在"+lifeValue+"岁，是个青年"); }
			else if (lifeValue<=17) {System.out.println("兔子"+mySerial+"现在"+lifeValue+"岁，是个老人"); }
			else if (lifeValue>17) {
				System.out.println("兔子"+mySerial+"现在"+lifeValue+"岁，已经死掉了"); 
				lifeState = -1;//将状态设置为死亡
			}
		}
	}
	public Rabbit() {
		System.out.println("我今天出生，我是条兔子，我的编号是："+mySerial);
	}
}
