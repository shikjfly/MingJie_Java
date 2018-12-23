package dahua2;

public class Monkey {

	String name;
	
	public Monkey() {}
	
	public Monkey(String name) {
	  this.name = name;
	}
	
	public void speak() {
	  System.out.println("hello, my name is "+ name);
	}
	
	public static void main(String[] args) {
	  Monkey m = new Monkey("智多星");
	  m.speak();
	  Monkey m2 = new Monkey("小不点");
	  m2.speak();
	}

}
