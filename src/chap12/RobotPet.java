package chap12;

public class RobotPet extends Pet {

//	���캯��
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
//���ҽ���
	public void introduce() {
		System.out.println("���ǻ����ˣ�"+getName());
		System.out.println("�����˵������ǣ�"+getMasterName());
	}
//	������
	public void work(int sw) {
		switch (sw) {
		case 0:	System.out.println("��ɨ");	break;
		case 1:	System.out.println("ϴ�·�");	break;
		case 2:	System.out.println("����");	break;
		}
	}
	
}
