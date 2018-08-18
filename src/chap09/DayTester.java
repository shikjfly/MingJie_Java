package chap09;

public class DayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day birthday = new Day(2018, 8, 18);
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
