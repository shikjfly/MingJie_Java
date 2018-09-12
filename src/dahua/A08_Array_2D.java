
package dahua;

public class A08_Array_2D {
	public static void main(String[] args) {

		String[] title = {"编号", "价格", "库存"};
		int[][] bookShop = { {1,2,3}, {200,350,250}, {5,3,10} };
		
		for(int i=0; i<bookShop.length; i++) {
			System.out.print(title[i]+"\t");
			
			for(int j=0; j<bookShop[i].length; j++) {
				System.out.print(bookShop[i][j]+"\t");
			}//for结束
			
			System.out.println();
						
		}//for结束
	}
}
