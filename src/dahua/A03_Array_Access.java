
package dahua;

public class A03_Array_Access {
	public static void main(String[] args) {
	
		int[] prc = new int[3];
		int prcLength = prc.length;
		
		prc[0] = 200;
		prc[1] = 350;
		prc[2] = 250;
//		prc[3] = 250;
		System.out.println("���м����飺"+prcLength);
		System.out.print("��ļ۸�");
		for(int i=0; i<prcLength; i++) {
			System.out.print(prc[i]+" ");
		}
		
	}
}

