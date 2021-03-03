package lab1;

import java.util.Scanner;

public class week1_255 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("nhap vao 2 so : ");
		Double n1=input.nextDouble();
		Double n2=input.nextDouble();
		
		double num3 = n1+n2;
		
		System.out.println("sum of "+ n1 +" and "+ n2 +" is "+   num3);
		
		System.out.printf("\n diffirent of "+ n1 +" and "+ n2 +" is %.2f" , (n1-n2));
		
		System.out.printf("\n product of "+ n1 +" and "+ n2 +" is %.2f" , (n1*n2));
		
		System.out.printf("\n quotient of "+ n1 +" and "+ n2 +" is %.6f" , (double)(n1/n2));
		

	}

}