package lab2;

import java.util.Scanner;

public class week2_55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("nhap vao thang muon kiem tra");
		int month = input.nextInt();
		while (month<=0 || month >12) {
			System.out.println("????????????? moi nhap lai ! ");
			month = input.nextInt();
		}
		System.out.println("nhap nam muon kiem tra : ");
		int year = input.nextInt();
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("thang "+ month + " nam " +year +" co 31 ngay ");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("thang " + month +" nam " + year +"  co 30 ngay");
				break;
			case 2:
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
					System.out.println("thang " + month +" nam " + year +"  co 29 ngay");
				} else {
					System.out.println("thang " + month +" nam " + year +"  co 28 ngay");
				}
				
		}
	}

}
