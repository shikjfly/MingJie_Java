package comword;

public class Worm implements IAnimal {
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
		if (lifeState == 1) {//1��ʾ���ӻ�����
			lifeValue =lifeValue + 1;//����һ��
			if (lifeValue<=5) {	System.out.println("����"+mySerial+"����"+lifeValue+"�꣬���Ǹ�����"); }
			else if (lifeValue<=15) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue<=20) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue>20) {
				System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ѿ�������"); 
				lifeState = -1;//��״̬����Ϊ����
			}
		}
	}
	public Worm() {
		System.out.println("�ҽ�����������������ӣ��ҵı���ǣ�"+mySerial);
	}
}
