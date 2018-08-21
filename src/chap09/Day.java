package chap09;

class Day {
	private int year;
	private int month;
	private int date;
	
//	 构造函数
	Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	int getYear() { return year; }
	int getMonth() { return month;}
	int getDate() { return date;}

	void setYear(int year) { this.year = year; }
	void setMonth(int month) { this.month = month; }
	void setDate(int date) { this.date = date; }
	
	void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
//	计算星期几
	int dayOfWeek() {
		int y = year;
		int m = month;
		if(m==1 || m==2) {
			y--;
			m +=12;
		}
		return (y+y/4 -y/100+y/400+(13*m+8)/5+date)%7;
	}
	
	boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	
}
