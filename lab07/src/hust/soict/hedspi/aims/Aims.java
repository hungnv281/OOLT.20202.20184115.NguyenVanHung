package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static void showMenu() {
		System.out.println(" Order Management Application : ");
        System.out.println("-------------------------------");
        System.out.println("1.Create new order");
        System.out.println("2.Add item to the order");
        System.out.println("3.Delete item by id");
        System.out.println("4.Display the items list of order");
        System.out.println("0.Exit");
        System.out.println("--------------------");
        System.out.println("Please choose a number : 0 - 1 - 2 - 3 - 4");
	}
	
    public static void main(String[] args) {
   
        int i = 0;
        ArrayList<Order> orders = new ArrayList<Order>();
        do{
        	showMenu();
        	Scanner input = new Scanner(System.in);
        	int choose = input.nextInt();
        	Order order1 = new Order();
        	switch (choose) {
        		case 1: 
                     if (i == Order.MAX_NUMBERS_ORDERED) {
                         System.out.println("can't add new order");
                     }
                     i++;
                     orders.add(order1);
                     System.out.println("Created new order");

                     break;
        		case 2:
        			orders.get(i-1).addMedia();
        			break;
        		case 3: 
        			System.out.println("input id of item : ");
        			int id = input.nextInt();
        			if (orders.contains(orders.get(id))) {
        				orders.get(i-1).removeMedia();
        			}
        			break;
        		case 4: 
        			
        			System.out.println("the items list of order: ");
                    orders.get(i - 1).printOrdered();
                    break;
        		case 0 : 
        			break;
        		default :
        			System.out.println("khong hop le ! nhap lại !");
        			break;
        	}
        } while (i !=  0);
       }
}

