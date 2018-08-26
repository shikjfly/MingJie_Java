package chap12;

import java.util.Iterator;

public class PetTest3 {
	
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		
			Pet[] a = {
				new Pet("Kurt", "��һ"),
				new RobotPet("R2D2", "¬��"),
				new Pet("���˶�", "Ӣ��")
			};
//			for(Pet p : a) {
//				intro(p);
//				System.out.println();
//			}

			for (int i = 0; i < a.length; i++) {
				System.out.println("a["+i+"]");
				if (a[i] instanceof RobotPet) {
					((RobotPet)a[i]).work(0);
				}else {
					a[i].introduce();
				}

			}
	}
}
