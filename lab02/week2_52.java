package lab2;

import java.util.Scanner;

public class week2_52 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("what is your name  ?");
		String strName = keyboard.nextLine();
		System.out.println("how old are you ? ");
		int iAge = keyboard.nextInt();
		System.out.println("how tall are you ?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. "+ strName +", "+ iAge+" years old "
				+ "your height is "+ dHeight +" .");
	}

}
