
package dahua;

public class A06_Array_Copy {
	public static void main(String[] args) {
//		int[] cntVan = {5, 3, 10}; //数量
		
		double[] prcVan = {200.0, 350.0, 250.0}; //价格
		double[] prcLisa = new double[prcVan.length]; // 上次帮忙打理之后，丽萨比较感兴趣，想开家一模一样的连锁店
		System.arraycopy(prcVan, 0, prcLisa, 0, prcVan.length); //全部复制
		
		
		for (int i = 0; i < prcLisa.length; i++) {
			prcLisa[i] *= 0.8; //第一次开张，生意不好，丽萨要八折出售
		}
		System.out.print("丽萨的价格：");
		for(double price : prcLisa) {
			System.out.print(price+" ");
		}
		
		System.out.println();
		
		System.out.print("梵高的价格：");
		for(double price : prcVan) {
			System.out.print(price+" ");
		}
		

		

		


	}
}
