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
		if (lifeState == 1) {//1��ʾ���껹����
			lifeValue =lifeValue + 1;//����һ��
			if (lifeValue<=2) {	System.out.println("����"+mySerial+"����"+lifeValue+"�꣬���Ǹ�����"); }
			else if (lifeValue<=10) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue<=15) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue>15) {
				System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ѿ�������"); 
				lifeState = -1;//��״̬����Ϊ����
			}
		}
	}
	public Fox() {
		System.out.println("�ҽ�����������������꣬�ҵı���ǣ�"+mySerial);
	}
}
