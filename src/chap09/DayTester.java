package chap09;

public class DayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day birthday = new Day(2018, 8, 18);
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
