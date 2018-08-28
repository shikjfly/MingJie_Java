package chap12;

import java.util.Iterator;

public class PetTest2 {
	
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		
			Pet[] a = {
				new Pet("Kurt", "°¬Ò»"),
				new RobotPet("R2D2", "Â¬¿Ë"),
				new Pet("Âõ¿Ë¶û", "Ó¢ÄÐ")
			};
//			for(Pet p : a) {
//				intro(p);
//				System.out.println();
//			}

			for (int i = 0; i < a.length; i++) {
				intro(a[i]);
				System.out.println();
			}
	}
}
