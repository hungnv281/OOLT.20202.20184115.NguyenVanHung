package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.test.media.TestMediaCompareTo;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application : ");
        System.out.println("-------------------------------");
        System.out.println("1.Create new order");
        System.out.println("2.Add item to the order");
        System.out.println("3.Delete item by id");
        System.out.println("4.Display the items list of order");
        System.out.println("5.Display the lucky item if exist ");
        System.out.println("0.Exit");
        System.out.println("--------------------");
        System.out.println("Please choose a number : 0 - 1 - 2 - 3 - 4 - 5");
	}
	
    public static void main(String[] args) {
//    	TestMediaCompareTo test = new TestMediaCompareTo();
//    	test.testMediaCompareTo();
        int i = 0;
        ArrayList<Order> orders = new ArrayList<Order>();
        int choose;
        do{
        	showMenu();
        	Scanner input = new Scanner(System.in);
        	choose = input.nextInt();
        	Order order1 = new Order();
        	switch (choose) {
        		case 1: 
                     try {
//                    	 if (i == Order.MAX_NUMBERS_ORDERED) {
                    	 i++;
                         orders.add(order1);
                         System.out.println("Created new order");
                       
                     }catch (Exception e) {
                    	 e.printStackTrace();
                    	 System.out.println("can't add new order");
                     }
                     break;
        		case 2:
        			try{
        				orders.get(i-1).addMedia();
        			}
        			catch (Exception e) {
        				e.printStackTrace();
        				System.out.println("plz create a order !  \n\n");
        			}
        			break;
        		case 3: 
        			System.out.println("input id of item : ");
        			int id = input.nextInt();
//        			if (orders.contains(orders.get(id))) {
//        				orders.get(i-1).removeMedia(id);
//        			}
        			try {
        				orders.get(i-1).removeMedia();
        			}
        			catch (Exception e ){
        				System.out.println("the id numbers not exits!");
        				e.printStackTrace();
        			}
        			break;
        		case 4: 
        			
        			try{
        				System.out.println("the items list of order: ");
        				orders.get(i - 1).printOrdered();
        			} catch (Exception e) {
        				System.out.println("ordered list not exits! ");
        				e.printStackTrace();
        			}
                    break;
        		case 5:
        			order1.getLuckyItem(order1);
        			break;
        		case 0 : 
        			System.out.println("Exited !!! ");
        			break;
        		default :
        			System.out.println("\n\nkhong hop le ! nhap lại !\n\n");
        			break;
        	}
        } while (choose !=  0);
       }
}

