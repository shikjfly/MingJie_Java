package chap09;

public class DayTester9 {
	
	 static boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] a ;
		
		a = new Day[]  {
				new Day(2018, 8, 23),
				new Day(2018, 8, 24)
		};

		
		
		String[] wd = {"��","һ","��","��","��","��","��"};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(
					"����������ڣ�"+
			 a[i].getYear() +"��" +
			 a[i].getMonth()+"��"+ 
			 a[i].getDate()+"�գ�������"+
			 wd[a[i].dayOfWeek()]			
					
					);
		}

		
		
	}

}
