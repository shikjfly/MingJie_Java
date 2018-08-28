package chap12;

public class PetTest {
	
	public static void main(String[] args) {
		Pet kurt = new Pet("Kurt", "°¬Ò»");
		kurt.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "Â¬¿Ë");
		r2d2.introduce();
		System.out.println();
		
		Pet p = r2d2;
		p.introduce();
	}
}
