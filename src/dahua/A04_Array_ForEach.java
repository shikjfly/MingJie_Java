
package dahua;

public class A04_Array_ForEach {
	public static void main(String[] args) {
		int[] prc = {200, 350, 250};
		int prcLength = prc.length;
		
		System.out.println("���м����飺"+prcLength);
		System.out.print("��ļ۸�");
		for(int price : prc) {
			System.out.print(price+" ");
		}

	}
}
