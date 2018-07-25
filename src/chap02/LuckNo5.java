package chap02;

import java.text.NumberFormat;
import java.util.Random;

public class LuckNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		double a = rand.nextDouble();
		double b = 10*a;
		
		//只保留两位小数点
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		String c = nf.format(b);
		//end只保留两位小数点
		System.out.println("0.0~1.0实数值: "+ c +"。" );

	}

}
