package dahua2;

public class Chapter01Pig {
	
	String food;
	
	String name;
	
	public Chapter01Pig() {
		// TODO Auto-generated constructor stub
	}
	
	public Chapter01Pig(String name, String food) {
		this.food = food;
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + " �������òͣ��ԣ�"+food);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter01Pig mPig = new Chapter01Pig("��˽�","��ͷ");
		mPig.eat();
	}

}
