package comword;
import java.util.ArrayList;
public class AnimalWord {
	
	
	public static void main(String[] args) {
			
		
		//保持动物的接口数组，里面存放了动物的接口
		final ArrayList<IAnimal> animals = new ArrayList<IAnimal>();
		
		Runnable run1 = new Runnable() {	
			final long timeInterval = 1000; //定义世界规则中的更新时间间隔
			@Override
			public void run() {
				while (true) {//保证时间不会停，一直运行下去
					//获取成长状态
					for (int i = 0; i < animals.size(); i++) {
						animals.get(i).grow(); //调用动物的更新方法
					}//for结束			
					System.out.println("------活着的动物数量："+animals.size()+" ------");
					
					//死亡处理
					for(int j=animals.size()-1; j>=0; j--) { //循环每一个接口的变量
						if (animals.get(j).getState() == -1) {//获取第j个动物的状态
							animals.remove(j);//从数组中删除
//							System.out.println("死亡处理过，正确的还活着的数量："+animals.size());
							IAnimal iAnimal;//保存动物对象接口变量
							int birthNum = (int)(Math.random()*4);
							switch (birthNum) {
							case 0:
								iAnimal = new Worm();break;
							case 1:
								iAnimal = new Cow();break;
							case 2:
								iAnimal = new Fox();break;
							case 3:
								iAnimal = new Rabbit();	break;
							default:
								iAnimal = new Worm();
							}
							animals.add(iAnimal);	
						}//if结束
					}//for结束
					
					try {Thread.sleep(timeInterval);//停顿1秒钟
					} catch (InterruptedException e) {System.out.println("停顿异常");
					}
				}//while结束
			}//run结束
		};//Runnable结束
		
		Runnable run2 = new Runnable() {
			final long timeInterval = 1364; //定义世界规则中的更新时间间隔
			@Override
			public void run() {	
				int k = 0;
				while(k < 10) {
					IAnimal iAnimal;//保存动物对象接口变量
					int birthNum = (int)(Math.random()*4);
					switch (birthNum) {
					case 0:
						iAnimal = new Worm();break;
					case 1:
						iAnimal = new Cow();break;
					case 2:
						iAnimal = new Fox();break;
					case 3:
						iAnimal = new Rabbit();	break;
					default:
						iAnimal = new Worm();
					}
					animals.add(iAnimal);	
					k++;
					try {Thread.sleep(timeInterval);//停顿1秒钟
					} catch (InterruptedException e) {System.out.println("停顿异常");
					}
				}//while结束				
			}//run结束
		};//Runnable结束

		//创建线程
		Thread t1 = new Thread(run1);
		t1.start();
		//创建线程
		Thread t2 = new Thread(run2);
		t2.start();
		
	}//main结束
}
