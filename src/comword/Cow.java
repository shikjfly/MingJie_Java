package comword;

public class Cow implements IAnimal {
	int mySerial = Serial.getInstance().getSerial();
	int lifeState = 1;
	int lifeValue = 0;
	
	@Override
	public int getState() {
		return lifeState;
	}

	@Override
	public void grow() {
		if (lifeState == 1) {//1��ʾţ������
			lifeValue =lifeValue + 1;//����һ��
			if (lifeValue<=10) {	System.out.println("ţ"+mySerial+"����"+lifeValue+"�꣬���Ǹ�����"); }
			else if (lifeValue<=22) {System.out.println("ţ"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue<=28) {System.out.println("ţ"+mySerial+"����"+lifeValue+"�꣬�Ǹ�����"); }
			else if (lifeValue>28) {
				System.out.println("ţ"+mySerial+"����"+lifeValue+"�꣬�Ѿ�������"); 
				lifeState = -1;//��״̬����Ϊ����
			}
		}
	}
	public Cow() {
		System.out.println("�ҽ��������������ţ���ҵı���ǣ�"+mySerial);
	}
}
