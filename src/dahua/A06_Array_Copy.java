
package dahua;

public class A06_Array_Copy {
	public static void main(String[] args) {
//		int[] cntVan = {5, 3, 10}; //����
		
		double[] prcVan = {200.0, 350.0, 250.0}; //�۸�
		double[] prcLisa = new double[prcVan.length]; // �ϴΰ�æ����֮�������Ƚϸ���Ȥ���뿪��һģһ����������
		System.arraycopy(prcVan, 0, prcLisa, 0, prcVan.length); //ȫ������
		
		
		for (int i = 0; i < prcLisa.length; i++) {
			prcLisa[i] *= 0.8; //��һ�ο��ţ����ⲻ�ã�����Ҫ���۳���
		}
		System.out.print("�����ļ۸�");
		for(double price : prcLisa) {
			System.out.print(price+" ");
		}
		
		System.out.println();
		
		System.out.print("��ߵļ۸�");
		for(double price : prcVan) {
			System.out.print(price+" ");
		}
		

		

		


	}
}
