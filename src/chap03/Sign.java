package chap03;

import java.util.*;
public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�����ǣ�");
		int a = stdIn.nextInt();
		
		
		if(  a>0  ) {
			System.out.println("��ֵ����0��");
		}else if(a<0){
			System.out.println("��ֵС��0��");			
		}else{
			System.out.println("��ֵ����0��");			
		}
	}

}
