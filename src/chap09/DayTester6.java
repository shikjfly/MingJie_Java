package chap09;

public class DayTester6 {
	
	 static boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day[] a = new Day[3];
		for (int i = 0; i < a.length; i++) {
			a[i].set(2018, 8, 23);
		}
		
		
		String[] wd = {"日","一","二","三","四","五","六"};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(
					"您输入的日期："+
			 a[i].getYear() +"年" +
			 a[i].getMonth()+"月"+ 
			 a[i].getDate()+"日，是星期"+
			 wd[a[i].dayOfWeek()]			
					
					);
		}

		
		
	}

}
