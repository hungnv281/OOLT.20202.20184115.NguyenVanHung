package lab2;

import java.util.Scanner;

public class week2_57 {
	static int d = 0;
	public static void main(String args[]) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("nhap vao kich thuoc ma tran a * b ");
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		int[][] array = new int[a][b];
		int[][] array1 = new int[a][b];
		System.out.println("nhap vao cac phan tu cua ma tran 1 ");
		for (int i = 0 ; i<a ; i++)
			for (int j = 0 ; j<b; j++) {
				System.out.printf("nhap phan tu %d,%d ",(i+1),(j+1));
				array[i][j]= input.nextInt();
			}
		System.out.println("nhap vao cac phan tu cua ma tran 2 ");
		for (int i = 0 ; i<a ; i++)
			for (int j = 0 ; j<b; j++) {
				System.out.printf("nhap phan tu %d,%d ",(i+1),(j+1));
				array1[i][j]= input.nextInt();
			}
		InMaTran(a,b,array);
		InMaTran(a,b,array1);
		
	}
	public static void InMaTran(int a, int b, int[][] array){
		d++;
		System.out.println("\n Ma tran thu " + d + " la : ");
		for (int i = 0 ; i< a;i++) {
			for (int j = 0 ; j<b ;j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

