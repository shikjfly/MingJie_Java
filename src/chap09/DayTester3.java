package chap09;

public class DayTester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day1 = new Day(2018, 8, 18);
		Day day2 = new Day(2018, 8, 18);
		
		if (day1 ==day2) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
		
		
		
		
		
		String[] wd = {"��","һ","��","��","��","��","��"};
		System.out.println(
				"����������ڣ�"+
		 day1.getYear() +"��" +
		 day1.getMonth()+"��"+ 
		 day1.getDate()+"�գ�������"+
		 wd[day1.dayOfWeek()]			
				
				);
		
		
	}

}
