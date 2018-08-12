package chap04;

import java.rmi.registry.Registry;
import java.util.*;

public class EvaluationOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int x = a++ * (2+a);
		System.out.println("a的值："+a);
		System.out.println("x的值："+x);
	}

}
