package chap09;

public class DayTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day birthday = new Day(2018, 8, 18);
		
		Day xDay = birthday;
		xDay.set(2010, 12, 22);
		
		String[] wd = {"��","һ","��","��","��","��","��"};
		System.out.println(
				"�������գ�"+
		 birthday.getYear() +"��" +
		 birthday.getMonth()+"��"+ 
		 birthday.getDate()+"�գ�������"+
		 wd[birthday.dayOfWeek()]			
				
				);
		
		
	}

}
