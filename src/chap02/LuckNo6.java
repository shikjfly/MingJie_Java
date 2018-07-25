package chap02;

import java.text.NumberFormat;
import java.util.Random;

public class LuckNo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		double a = rand.nextDouble();
		double b = rand.nextDouble();
		
		double c = a-b;
		

		//只保留两位小数点
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		String d = nf.format(c);
		//end只保留两位小数点
		
		System.out.println("-1.0~1.0实数值:"+ d +"。" );

	}

}
