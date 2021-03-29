package lab4;

public class DateUtils {

	public static boolean compareMyDate(MyDate date1, MyDate date2) {
        if(date1.getYear() > date2.getYear())
            return true;
        else if (date1.getYear() < date2.getYear())
            return false;
        else {
            if(date1.getMonth() > date2.getMonth())
                return true;
            else if(date1.getMonth() < date2.getMonth())
                return false;
            else {
                if(date1.getDay() > date2.getDay())
                    return true;
                else if(date1.getDay() < date2.getDay())
                    return false;
                else 
                    return false;
            }
        }
    }
	public void sortDate(MyDate date[]) {
		for (int i =0 ; i<date.length-1;i++)
			for (int j = i+1;j<date.length;j++)
				if (compareMyDate(date[i], date[j]) ){
					MyDate tg = new MyDate();
					tg.setDay(date[i].getDay());
					date[i].setDay(date[j].getDay());
					date[j].setDay(tg.getDay());
					
					tg.setMonth(date[i].getMonth());
					date[i].setMonth(date[j].getMonth());
					date[j].setMonth(tg.getMonth());
					
					tg.setYear(date[i].getYear());
					date[i].setYear(date[j].getYear());
					date[j].setYear(tg.getYear());
				}
	}
	public static void print(MyDate[] date) {
        for(int i=0;i<date.length;i++)
            date[i].print();
    }

}
