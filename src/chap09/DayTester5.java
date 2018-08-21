package chap09;

public class DayTester5 {
	
	 static boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = new Day(2018, 8, 18);
		Day day2 = new Day(2018, 8, 18);
		
		if (compDay(day1, day2)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		
		
		
		
		String[] wd = {"日","一","二","三","四","五","六"};
		System.out.println(
				"您输入的日期："+
		 day1.getYear() +"年" +
		 day1.getMonth()+"月"+ 
		 day1.getDate()+"日，是星期"+
		 wd[day1.dayOfWeek()]			
				
				);
		
		
	}

}
