
package dahua;

public class A01_AND_OR {
	public static void main(String[] args) {
		int space = 25, price = 4000000;
		boolean hasBalcony = true, hasDinRoom=false;
		//�������30�ҽ��С��4000000�ͷ���Ҫ���Ǿ�����
		System.out.println(space>=30 && price<=4000000);
		//������Ʋ��ɼ�ã��и���̨���߳����ͺá�
		System.out.println(hasBalcony || hasDinRoom);
	}
}
