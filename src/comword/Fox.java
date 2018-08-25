package comword;

public class Fox implements IAnimal {
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
		if (lifeState == 1) {//1表示狐狸还活着
			lifeValue =lifeValue + 1;//长了一岁
			if (lifeValue<=2) {	System.out.println("狐狸"+mySerial+"现在"+lifeValue+"岁，还是个孩子"); }
			else if (lifeValue<=10) {System.out.println("狐狸"+mySerial+"现在"+lifeValue+"岁，是个青年"); }
			else if (lifeValue<=15) {System.out.println("狐狸"+mySerial+"现在"+lifeValue+"岁，是个老人"); }
			else if (lifeValue>15) {
				System.out.println("狐狸"+mySerial+"现在"+lifeValue+"岁，已经死掉了"); 
				lifeState = -1;//将状态设置为死亡
			}
		}
	}
	public Fox() {
		System.out.println("我今天出生，我是条狐狸，我的编号是："+mySerial);
	}
}
