
package dahua;

public class A09_Array_Irregular {
	public static void main(String[] args) {

		String[] shopName = {"������", "�������"};
		String[][] bookShop = { {"��������","˫�Ǽ�","��ѧ����","С������"}, 
				{"��������","˯����","�췽ҹ̷"} };
		for(int i=0; i<bookShop.length; i++) {
			System.out.print(shopName[i]+"\t");
			
			for(int j=0; j<bookShop[i].length; j++) {
				System.out.print(bookShop[i][j]+"\t");
			}//for����
			
			System.out.println();
		}//for����
	}
}
