package chap02;

import java.text.NumberFormat;
import java.util.Random;

public class LuckNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Random rand = new Random();
		double a = rand.nextDouble();
		
		//ֻ������λС����
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		String b = nf.format(a);
		//endֻ������λС����
		
		System.out.println("0~1.0ʵ��ֵ: "+ b +"��" );

	}

}
