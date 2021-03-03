package lab2;

import java.util.Scanner;

public class week2_56 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("nhap so phan tu cua mang :");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i<n ;i++) {
			System.out.printf("nhap vao phan tu thu %d" , (i+1) , " :");
			a[i]  = input.nextInt();
			sum += a[i];
		}
		System.out.println();
		System.out.println("cac phan tu cua mang :");
		for (int i : a) {
			System.out.print( i + "  ");
		}
		System.out.println();
		System.out.println(" tong cua mang :" + sum);
		System.out.printf("gia tri trung binh cua cac phan tu :%.2f" , (double)(sum/n));
		int tg ; // trung gian
		for (int i = 0 ; i < n-1 ; i++)
			for (int j = i+1 ; j<n; j++)
				if (a[i]>a[j]) {
					tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
		System.out.println("\nmang sau khi sap xep tang dan :");
		for (int i : a) {
			System.out.print(i+ "  ");
		}
	}

}
