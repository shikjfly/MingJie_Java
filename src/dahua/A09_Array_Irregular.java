
package dahua;

public class A09_Array_Irregular {
	public static void main(String[] args) {

		String[] shopName = {"梵谷书店", "丽萨书店"};
		String[][] bookShop = { {"乱世佳人","双城记","科学怪人","小美人鱼"}, 
				{"乱世佳人","睡美人","天方夜谭"} };
		for(int i=0; i<bookShop.length; i++) {
			System.out.print(shopName[i]+"\t");
			
			for(int j=0; j<bookShop[i].length; j++) {
				System.out.print(bookShop[i][j]+"\t");
			}//for结束
			
			System.out.println();
		}//for结束
	}
}
