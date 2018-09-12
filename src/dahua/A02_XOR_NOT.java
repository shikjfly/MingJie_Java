
package dahua;

public class A02_XOR_NOT {
	public static void main(String[] args) {
		boolean furniture = true, decoration=true;
		//装修和家具，只能送一套，全送出去，那不是亏了么
		System.out.println(furniture ^ decoration);
	}
}
