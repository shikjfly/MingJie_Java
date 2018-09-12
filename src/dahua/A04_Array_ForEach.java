
package dahua;

public class A04_Array_ForEach {
	public static void main(String[] args) {
		int[] prc = {200, 350, 250};
		int prcLength = prc.length;
		
		System.out.println("共有几本书："+prcLength);
		System.out.print("书的价格：");
		for(int price : prc) {
			System.out.print(price+" ");
		}

	}
}
