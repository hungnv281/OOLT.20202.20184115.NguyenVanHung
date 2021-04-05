package hust.soict.hedspi.aims.utils;

import java.util.Random;
import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;



public class Order {
	public static int qtyOrder;
	public static final int MAX_NUMBERS_ORDERED = 5;
	private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	private MyDate dateOrdered;
	
	private Order() {
		dateOrdered = new MyDate();
	}
	   
	public static Order createOrder() {
		  if(nbOrders < MAX_LIMITTED_ORDERS)
	        {
	            nbOrders++;
	            Order newOrder = new Order();
	            return newOrder;
	        }
	        else {
	            System.out.println("The numbers of orders is almost max.");
	            return null;
	        }
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int newQtyOrder = 0;
		newQtyOrder = qtyOrder+dvdList.length;
		if (newQtyOrder<=MAX_NUMBERS_ORDERED) {
			for (int i = 0; i<dvdList.length;i++) {
				addDigitalVideoDisc(dvdList[i]);
				System.out.println(" them thanh cong dia " + dvdList[i].getTitle());
			}
		} else {
			int c =  qtyOrder;
			for (int i = 0; i< MAX_NUMBERS_ORDERED-c;i++) {
				addDigitalVideoDisc(dvdList[i]);
				System.out.println(" them thanh cong dia " + dvdList[i].getTitle());
			}
			for (int i  =  MAX_NUMBERS_ORDERED-c;i < dvdList.length;i++) {
				System.out.println("khong the them dia " + dvdList[i].getTitle() + " do vuot qua so luong !");
			}
		}			
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if (qtyOrder > 10) {
			System.out.println("don hang da day !");
		} else if (qtyOrder == 10) {
			System.out.println("don hang sap day !");
		} else {
			qtyOrder++;
			itemsOrdered[qtyOrder-1] = disc;
			System.out.println(itemsOrdered[qtyOrder-1].getCost());
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2 ) {
		if (itemsOrdered.length<MAX_NUMBERS_ORDERED) {
			addDigitalVideoDisc(dvd1);
		} else {
			System.out.println("khong the them dia " + dvd1.getTitle() +" va " + dvd2.getTitle());
			System.exit(0);
		}
		if (itemsOrdered.length<MAX_NUMBERS_ORDERED) {
			addDigitalVideoDisc(dvd2);
		}
	}
	
	public static void removeDigitalVideoDisc  ( DigitalVideoDisc disc) {
		int c= 0;
		for (int i = 0 ; i <=  qtyOrder ; i++) {
			if (itemsOrdered[i] != disc ) {
				itemsOrdered[c] = itemsOrdered[i];
				c++;
			}
		}
		qtyOrder=c-1;
		System.out.println("xoa thanh cong " + disc.getTitle());
		System.out.println(" cac dia con lai la  ");
		for (int i = 0; i<qtyOrder; i++) {
			System.out.print(itemsOrdered[i].getTitle()+ "   ");
			System.out.println();
		}
	}	
	
	public void hienThi() {
		System.out.println("cac dia trong gio hang la : ");
		for (int i = 0; i< qtyOrder;i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
		
	}
	
	public void totalCost() {
		float total = 0;
		for (int i = 0;  i< qtyOrder; i++) {  
			float t = 0;
			total = total + itemsOrdered[i].getCost();
		}	
		System.out.println("tong gia tien la " + total);
	}
	
	public DigitalVideoDisc nhapThongTinDia(DigitalVideoDisc disc) {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap Category :");
		String a = input.nextLine();
		disc.setCategory(a);
		System.out.println("nhap gia : ");
		float b = input.nextFloat();
		disc.setCost(b);
		System.out.println("nhap tac gia : ");
		String c = input.nextLine();
		disc.setDirector(input.nextLine());
		System.out.println("nhap vao do dai : ");
		int d = input.nextInt();
		disc.setLength(d);
		System.out.println("nhap vao tieu de : ");
		String f = input.nextLine();
		String g = input.nextLine();
		disc.setTitle(g);
		//add the dvd to the order
		//addDigitalVideoDisc(disc);
		System.out.println("them thanh cong " + disc.getTitle());
		return disc;
	}
	
	public void printList(DigitalVideoDisc[] disc) {
		int total = 0;
		System.out.println("\n***************** Order *****************");
		System.out.print("Date : " );
		dateOrdered.print();
		for (int i = 0 ;i<disc.length; i++) {
		try {	
			System.out.printf("%d .DVD" ,i + 1);
			System.out.println(" - [" + disc[i].getTitle()+"] - [" +disc[i].getCategory() +"] - ["+disc[i].getDirector()+"] - ["
			+ disc[i].getLength()+"] - ["+disc[i].getCost()+"$]");
			total += disc[i].getCost();
		}catch (Exception DVDException) {
			total += disc[disc.length-2].getCost();
		}}
		System.out.println("Total cost : " + total);
	}
	public void printListAfterUpdate(DigitalVideoDisc[] disc) {
		int total = 0;
		System.out.println(qtyOrder);
		DigitalVideoDisc discFree = getALuckyItem();
		System.out.println("\n***************** Order *****************");
		System.out.print("Date : " );
		dateOrdered.print();
		for (int i = 0 ;i<qtyOrder; i++) {
			if (disc[i].getTitle().equals(discFree.getTitle())) {
				disc[i].setCost(0);
			}
			System.out.printf("%d .DVD" ,i + 1);
			System.out.println(" - [" + disc[i].getTitle()+"] - [" +disc[i].getCategory() +"] - ["+disc[i].getDirector()+"] - ["
			+ disc[i].getLength()+"] - ["+disc[i].getCost()+"$]");
			total += disc[i].getCost();
		}
		System.out.println("Total cost : " + total); 
	}
	public DigitalVideoDisc getALuckyItem() {
		System.out.println(itemsOrdered.length);
		Random generator = new Random(); 
		int i = generator.nextInt(qtyOrder) ;
		return itemsOrdered[i];
	}
	
public static void main(String[] args) {
		
		Order anOrder = Order.createOrder();
        Order twoOrder = Order.createOrder();
        Order threeOrder = Order.createOrder();
        Order fourOrder = Order.createOrder();
        Order fiveOrder = Order.createOrder();
        Order sixOrder = Order.createOrder();
        System.out.println();
		// create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king");
		dvd1.setCategory("animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger allers");
		dvd1.setLength(87);
		//add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars");
		dvd2.setCategory("science fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("george lucas");
		dvd2.setLength(87);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.95f);
		dvd3.setDirector("John musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.totalCost();
		
		System.out.println(dvd3.search("Ala ddin"));
		
		anOrder.printListAfterUpdate(itemsOrdered);
	
	}	
}

