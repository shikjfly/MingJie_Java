
package dahua;

import java.util.Arrays;

public class A07_Array_Sort {
	public static void main(String[] args) {
		int[] cntLisa = {5, 3, 10}; //数量
		
		System.out.print("书籍存储量排序：");
		Arrays.sort(cntLisa);
		
		for(int count : cntLisa) {
			System.out.print(count+" ");
		}
		
	}
}
