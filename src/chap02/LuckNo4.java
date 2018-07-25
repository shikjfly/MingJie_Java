package chap02;

import java.text.NumberFormat;
import java.util.Random;

public class LuckNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		double a = rand.nextDouble();
		
		//只保留两位小数点
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		String b = nf.format(a);
		//end只保留两位小数点
		
		System.out.println("0~1.0实数值: "+ b +"。" );

	}

}
