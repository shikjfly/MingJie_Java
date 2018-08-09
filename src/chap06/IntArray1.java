package chap06;

public class IntArray1 {

	public static void main(String[] args) {
		
		double[] a = new double[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
