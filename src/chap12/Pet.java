package chap12;

public class Pet {
	private String name;//��������
	private String masterName;//�������������

//	���캯��
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	public String getName() { return name;}
	public String getMasterName() { return masterName;}
//���ҽ���
	public void introduce() {
		System.out.println("�ҵ������ǣ�"+name);
		System.out.println("�����˵������ǣ�"+masterName);
	}
	
}
