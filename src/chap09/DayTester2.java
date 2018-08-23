package chap09;

public class DayTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day birthday = new Day(2018, 8, 18);
		
		Day xDay = birthday;
		xDay.set(2010, 12, 22);
		
		String[] wd = {"日","一","二","三","四","五","六"};
		System.out.println(
				"您的生日："+
		 birthday.getYear() +"年" +
		 birthday.getMonth()+"月"+ 
		 birthday.getDate()+"日，是星期"+
		 wd[birthday.dayOfWeek()]			
				
				);
		
		
	}

}
