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
		if (lifeState == 1) {//1��ʾ���ӻ�����
			lifeValue =lifeValue + 1;//����һ��
			if (lifeValue<=3) {	System.out.println("����"+mySerial+"����"+lifeValue+"�꣬���Ǹ�����"); }
			else if (lifeValue<=12) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue<=17) {System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue>17) {
				System.out.println("����"+mySerial+"����"+lifeValue+"�꣬�Ѿ�������"); 
				lifeState = -1;//��״̬����Ϊ����
			}
		}
	}
	public Rabbit() {
		System.out.println("�ҽ�����������������ӣ��ҵı���ǣ�"+mySerial);
	}
}
