package hust.soict.hedspi.aims.utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String string;
	public MyDate() {
	        Calendar currentDate = Calendar.getInstance();
	        this.day = currentDate.get(Calendar.DAY_OF_MONTH);
	        this.month = currentDate.get(Calendar.MONTH);
	        this.year = currentDate.get(Calendar.YEAR);
	    }
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		 Calendar cDate = Calendar.getInstance();
	        cDate.set(year, month, 1); 
	        if(day < 1 || day > cDate.getActualMaximum(Calendar.DAY_OF_MONTH) ){ 
	            System.out.println("Invalid day.");
	            return;
	        }
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public void setMonth(int month) {
		if(month<1 || month > 12) { 
            System.out.println("Invalid month.");
            return;
        }
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		 if(year< 1 || year > 9999) { 
	            System.out.println("Invalid year.");
	            return;
	        }
		this.year = year;
	}
	public MyDate(int day, int month, int year) {
		super();
		if (isValidDate(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else {
			System.out.println("inValid ! ");
		}
	}
	
	public static boolean isValidDate(int day, int month , int year) {
		Calendar date  =  Calendar.getInstance();
		date.set(year, month, day);
		return ((year >= 1) && (year <= 9999)) 
	                && ((month >= 1) && (month <= 12))
	                && ((day >= 1) && (day <= date.getActualMaximum(Calendar.DAY_OF_MONTH)));
	}
	
	public String accept() {
		Scanner input =  new Scanner(System.in);
		System.out.println("nhap vao chuoi~ string: ");
		this.string = input.nextLine();
		string = string.replaceAll("\\s\\s+", " ");
		string = string.trim();
		//System.out.println(string);
		
		String[] part = string.split(" ");
		part[0]= part[0].toUpperCase();
		switch (part[0]) {
			case "JANUARY" : 
				this.month = 1;
				break;
			case "FEBRUARY" : 
				this.month = 2;
				break;
			case "MARCH" : 
				this.month = 3;
				break;
			case "APRIL" : 
				this.month = 4;
				break;
			case "MAY" : 
				this.month = 5;
				break;
			case "JUNE" : 
				this.month = 6;
				break;
			case "JULY" : 
				this.month = 7;
				break;
			case "AUGUST" : 
				this.month = 8;
				break;
			case "SEPTEMBER" : 
				this.month = 9;
				break;
			case "OCTOBER" : 
				this.month = 10;
				break;
			case "NOVEMBER" : 
				this.month = 11;
				break;
			case "DECEMBER" : 
				this.month = 12;
				break;
			default : 
				
				System.exit(0);
			
		}
		this.year = Integer.parseInt(part[2]);
		
		this.day = Integer.parseInt(part[1].substring(0, part[1].length()-2));
		return this.day + " "+ this.month + " "+this.year;
	}
	
	public void print() {
        Calendar fDate = Calendar.getInstance();
        fDate.set(year, month, day);
        String dateFormat;
        
        switch (day) {
            case 1:
                dateFormat = "MMMMM d'st' yyyy";
                break;
            case 2:
                dateFormat = "MMMMM d'nd' yyyy";
                break;
            case 3:
                dateFormat = "MMMMM d'rd' yyyy";
                break;
            default:
                dateFormat = "MMMMM dd'th' yyyy";
                break;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        System.out.println(formatter.format(fDate.getTime())); 
                                                                
    }
	 public void printFormat() {
	        Calendar fDate = Calendar.getInstance();
	        fDate.set(year, month, day);
	        String dateFormat;
	        int opt;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Please choose the optional date format; ");
	        System.out.println("1. yyyy-MM-dd");
	        System.out.println("2. d/M/yyyy");
	        System.out.println("3. dd-MMM-yyyy");
	        System.out.println("4. MMM d yyyy");
	        System.out.println("5. mm-dd-yyyy");
	        opt = input.nextInt();
	        
	        switch (opt) {
	            case 1:
	                dateFormat = "yyyy-MM-dd";
	                break;
	            case 2:
	                dateFormat = "d/M/yyyy";
	                break;
	            case 3:
	                dateFormat = "dd-MMM-yyyy";
	                break;
	            case 4:
	                dateFormat = "MMM d yyyy";
	                break;
	            case 5:
	                dateFormat = "mm-dd-yyyy";
	                break;
	            default:
	                dateFormat = "MMMMM dd yyyy";
	                break;
	        }
	        
	        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
	        System.out.println(formatter.format(fDate.getTime())); 
	                                                                
	    }
}
