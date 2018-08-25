package cominterface;

import java.util.ArrayList;

import com.SnakeHuge;

public class monstInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IMonst> monsts = new ArrayList<IMonst>();
		IMonst dragon = new Dragon();
		monsts.add(dragon);
		monsts.add(new Pig());	
		monsts.add(new Snake());		
		monsts.add(new SnakeHuge());
		
		for (int i = 0; i < monsts.size(); i++) {
			monsts.get(i).attack();
		}


	}

}
