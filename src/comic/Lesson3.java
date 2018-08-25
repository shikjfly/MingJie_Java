package comic;

import com.Snake;
import com.SnakeHuge;

public class Lesson3 {

	public static void main(String[] args) {

		Snake snake2 = new SnakeHuge(); //将子类的对象，保存到父类的对象变量中
		System.out.println("创建了一个对象sanke2");
		snake2.name = "xx";
		System.out.println(snake2.length);
		snake2.attack();
//		snake2.doI();
/*
 * 总结： 将子类SnakeHuge类的对象，赋值给了父类Snake的对象变量snake2，
 * 赋值后的snake2，拥有父类Sanke的全部属性，但是隐藏了子类SnakeHuge的属性
 * 但是会调用子类SnakeHuge的----同名方法---，不同名的方法，不会调用
 * 
 */

	
	}
	
}
