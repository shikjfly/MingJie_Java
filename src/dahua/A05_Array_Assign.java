
package dahua;

public class A05_Array_Assign {
	public static void main(String[] args) {
//		int[] prc = {200, 350, 250}; //�۸�
		int[] cntVan = {5, 3, 10}; //����
		int[] cntLisa = cntVan; // ��߳�ȥ�棬��꽻����������
		
		cntLisa[0] = 0; // ��������һ��������
		System.out.print("����С��������������");
		for(int count : cntLisa) {
			System.out.print(count+" ");
		}

		System.out.println();
		
		System.out.print("��߻���֮����ֵ�������");
		for(int count : cntVan) {
			System.out.print(count+" ");
		}
		

		


	}
}
