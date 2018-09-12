
package dahua;

public class A05_Array_Assign {
	public static void main(String[] args) {
//		int[] prc = {200, 350, 250}; //价格
		int[] cntVan = {5, 3, 10}; //数量
		int[] cntLisa = cntVan; // 梵高出去玩，书店交由丽萨打理
		
		cntLisa[0] = 0; // 丽萨将第一本卖完了
		System.out.print("丽萨小姐卖完后的数量：");
		for(int count : cntLisa) {
			System.out.print(count+" ");
		}

		System.out.println();
		
		System.out.print("梵高回来之后接手的数量：");
		for(int count : cntVan) {
			System.out.print(count+" ");
		}
		

		


	}
}
