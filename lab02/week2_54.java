package lab2;

import java.util.Scanner;

public class week2_54 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("nhap vao chieu cao : ");
		int h = input.nextInt();
	
		for (int i = 0; i <h;i++) {
			for (int j = 0 ; j<h-i-1; j++) System.out.print(" ");
			for (int k = h-i-1;k<h+i;k++) System.out.print("*");
			for (int k = h+i;k<h*2-1;k++) System.out.print(" ");
			System.out.println();
		}
		
	}

}
