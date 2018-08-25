package comic;

import com.Dragon;
import com.IFire;
import com.IMonstBase;
import com.MonstBase;
import com.Pig;
import com.Snake;

public class Lesson4 {

	public static void main(String[] args) {

			MonstBase monst1 = new MonstBase();
			MonstBase monst2 = new Dragon();
			monst1.attack();
			monst2.attack();
			
			IMonstBase monstInter1 = new Pig();
			monstInter1.attack();
			
			IFire myFire = new Snake();
			myFire.fire();
	}
	
}
