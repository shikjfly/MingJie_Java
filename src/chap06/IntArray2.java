package chap06;

public class IntArray2 {

	public static void main(String[] args) {
		
		double[] a = new double[5];
		
		for (int i = 1; i < 6; i++) {
			a[i-1] = i;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
