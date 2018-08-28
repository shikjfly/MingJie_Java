package chap12;

public class Pet {
	private String name;//宠物名字
	private String masterName;//宠物的主人名字

//	构造函数
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	public String getName() { return name;}
	public String getMasterName() { return masterName;}
//自我介绍
	public void introduce() {
		System.out.println("我的名字是："+name);
		System.out.println("我主人的名字是："+masterName);
	}
	
}
