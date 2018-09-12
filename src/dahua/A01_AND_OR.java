
package dahua;

public class A01_AND_OR {
	public static void main(String[] args) {
		int space = 25, price = 4000000;
		boolean hasBalcony = true, hasDinRoom=false;
		//面积大于30且金额小于4000000就符合要求，那就买了
		System.out.println(space>=30 && price<=4000000);
		//鱼和熊掌不可兼得，有个阳台或者厨房就好。
		System.out.println(hasBalcony || hasDinRoom);
	}
}
