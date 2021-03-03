package lab1;

import java.util.Scanner;


public class week1_256 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// giai he phuong trinh bac nhat 2 an
		
		System.out.println("nhap vao cac he so a11,a12,a21,a22: \n");
		int a11 = input.nextInt();
		int a12 = input.nextInt();
		int a21 = input.nextInt();
		int a22 = input.nextInt();
		System.out.println("nhap vao cac he so b1,b2: \n");
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		int d,d1,d2;
		d=a11*a22-a21*a12;
		d1=b1*a22-b2*a12;
		d2=a11*b2-a21*b1;
		if (d!=0) {
			System.out.println("x1,x2 = "+ d1 +"/"+  d +"  "+  d2+"/"+d);
		} else if (d==d1&&d==d2&&d==0 ){
			System.out.println("co vo so nghiem x1,x2 thoa man ");
		} 
		System.out.println();
		
		// giai phuong trinh bac nhat
		
		System.out.println("\n pt ax+b=0.....nhap vao he so a va b: ");
		int a = input.nextInt();
		int b = input.nextInt();
		if (b == a && b == 0) {
			System.out.println(" co vo so nghiem thoa man");
		} else if (a==0 && b!=0) {
			System.out.println("vo nghiem !");
		} else {
			System.out.printf("%s %.2f" ,"pt co nghiem ", (double)(-b/a));
		}
		
		// giai phuong trinh bac 2
		
		System.out.println("\n nhap vao he so phuong trinh ax^2+bx+c=0 :");
		a = input.nextInt();
		b = input.nextInt();
		int c=input.nextInt();
		if (a==0) {
			if (b==0) {
				System.out.println("phuong trinh vo nghiem");
			} else {
				System.out.println("phuong trinh co nghiem x = "+ (double)(-c/b));
			}
		}
		double delta = b*b-4*a*c;
		double x1 ,x2;
		if (delta > 0) {
			x1 = (double)((-b+Math.sqrt(delta)/(2*a)));
			x2 = (double)((-b-Math.sqrt(delta)/(2*a)));
			System.out.println("phuong trinh co 2 nghiem la x1 =" +x1 + " , x2 = "+ x2);
			
		} else if (delta == 0) {
			x1 = (-b/(2*a));
			System.out.println("phuong trinh co nghiem kep x = " + x1);
		} else {
			System.out.println("phuong trinh vo nghiem!");
		}
	}
}