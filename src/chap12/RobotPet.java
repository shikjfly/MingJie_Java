package chap12;

public class RobotPet extends Pet {

//	构造函数
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
//自我介绍
	public void introduce() {
		System.out.println("我是机器人："+getName());
		System.out.println("我主人的名字是："+getMasterName());
	}
//	做家务
	public void work(int sw) {
		switch (sw) {
		case 0:	System.out.println("打扫");	break;
		case 1:	System.out.println("洗衣服");	break;
		case 2:	System.out.println("做饭");	break;
		}
	}
	
}
