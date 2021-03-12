package lab3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String string;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
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
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate() {
		super();
	}

	
	public String accept() {
		Scanner input =  new Scanner(System.in);
		System.out.println("nhap vao chuoi~ string : ");
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
	
	public static String print() {
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
		String s = localDate.format(formatter);
		
		return s;
		
	}
}
