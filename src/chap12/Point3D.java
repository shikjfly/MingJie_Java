package chap12;

public class Point3D extends Point2D {
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void setZ(int z) {	this.x = z;	}
	
	int getZ() { return z; }

}
