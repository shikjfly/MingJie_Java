package comword;
import java.util.ArrayList;
public class AnimalWord {
	
	
	public static void main(String[] args) {
			
		
		//���ֶ���Ľӿ����飬�������˶���Ľӿ�
		final ArrayList<IAnimal> animals = new ArrayList<IAnimal>();
		
		Runnable run1 = new Runnable() {	
			final long timeInterval = 1000; //������������еĸ���ʱ����
			@Override
			public void run() {
				while (true) {//��֤ʱ�䲻��ͣ��һֱ������ȥ
					//��ȡ�ɳ�״̬
					for (int i = 0; i < animals.size(); i++) {
						animals.get(i).grow(); //���ö���ĸ��·���
					}//for����			
					System.out.println("------���ŵĶ���������"+animals.size()+" ------");
					
					//��������
					for(int j=animals.size()-1; j>=0; j--) { //ѭ��ÿһ���ӿڵı���
						if (animals.get(j).getState() == -1) {//��ȡ��j�������״̬
							animals.remove(j);//��������ɾ��
//							System.out.println("�������������ȷ�Ļ����ŵ�������"+animals.size());
							IAnimal iAnimal;//���涯�����ӿڱ���
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
						}//if����
					}//for����
					
					try {Thread.sleep(timeInterval);//ͣ��1����
					} catch (InterruptedException e) {System.out.println("ͣ���쳣");
					}
				}//while����
			}//run����
		};//Runnable����
		
		Runnable run2 = new Runnable() {
			final long timeInterval = 1364; //������������еĸ���ʱ����
			@Override
			public void run() {	
				int k = 0;
				while(k < 10) {
					IAnimal iAnimal;//���涯�����ӿڱ���
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
					try {Thread.sleep(timeInterval);//ͣ��1����
					} catch (InterruptedException e) {System.out.println("ͣ���쳣");
					}
				}//while����				
			}//run����
		};//Runnable����

		//�����߳�
		Thread t1 = new Thread(run1);
		t1.start();
		//�����߳�
		Thread t2 = new Thread(run2);
		t2.start();
		
	}//main����
}
