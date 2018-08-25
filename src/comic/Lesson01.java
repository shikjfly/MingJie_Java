package comic;

import com.Snake;

public class Lesson01 {

	public static void main(String[] args) {

		Snake s1 = new Snake(12,10,99,"Snake1", true); //生成一条蛇对象，并保存到对象变量中
		System.out.println("创建了一个对象S1");
		s1.setAge(33);
		System.out.println("s1的年龄是："+ s1.getAge());

		s1.sayName();
//		s1.fire();
		s1.saniao();
		
	}
	
}
