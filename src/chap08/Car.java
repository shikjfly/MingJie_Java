package chap08;

public class Car {
	
	private String name;
	private int width;
	private int height;
	private int lenght;
	private double x;
	private double y;
	private double fuel;
//构造函数
	public Car(String name, int width, int height, int lenght, double fuel) {
		this.name = name;  
		this.width = width;
		this.height = height;
		this.lenght = lenght;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	double getX(){		return x;	}
	double getY(){		return y;	}
	double getFuel(){		return fuel;	}
	
	//	向x移动dx，向y移动dy
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		if (dist > fuel) {
			return false;
		}else {
			fuel -= dist;
			x += dx;
			y +=dy;
			return true;
		}
	}
	
	//显示参数
	void putSpec() {
		System.out.println("名称： " + name);
		System.out.println("车宽： " + width +"mm");
		System.out.println("车高： " + height +"mm");
		System.out.println("车长： " + lenght +"mm");
	}
}
