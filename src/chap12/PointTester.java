package chap12;

public class PointTester {

	public static void main(String[] args) {
		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);
		System.out.println("a: "+a.getX()+","+a.getY());
		System.out.println("b: "+b.getX()+","+b.getY()+","+b.getZ());
	}

}
