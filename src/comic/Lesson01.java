package comic;

import com.Snake;

public class Lesson01 {

	public static void main(String[] args) {

		Snake s1 = new Snake(12,10,99,"Snake1", true); //����һ���߶��󣬲����浽���������
		System.out.println("������һ������S1");
		s1.setAge(33);
		System.out.println("s1�������ǣ�"+ s1.getAge());

		s1.sayName();
//		s1.fire();
		s1.saniao();
		
	}
	
}
