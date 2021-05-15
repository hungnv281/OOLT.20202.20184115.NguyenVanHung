package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class TestMediaCompareTo {
	public void testMediaCompareTo() {
		ArrayList<Media> collection = new ArrayList();
		Order order = new Order();
		System.out.println("input the quantity of item :");
		Scanner input = new Scanner(System.in);
		int quantity = input.nextInt();
		for (int i = 0 ; i < quantity ; i++) {
			System.out.println("plz press 2 to add a dvd ! ");
			order.addMedia();
			collection.add(order.getItem(i));
		}
		
		Iterator<Media> iterator =  collection.iterator();
		
		System.out.println("------------------------------");
		System.out.println("The DVDs currently in the order are:");
		
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("******************************");
		for (int i = 0 ; i < collection.size()-1 ; i++) {
			for (int j = i + 1 ; j < collection.size(); j++) {
				
				if (collection.get(i).compareTo(collection.get(j)) == 1) {
					DigitalVideoDisc tg = new DigitalVideoDisc();
					tg.setNew(collection.get(i));
					collection.get(i).setNew(collection.get(j));				
					collection.get(j).setNew(tg);
				}
			}
		}
		
		System.out.println("------------------------------");
		System.out.println("After : ");
		iterator =  collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("******************************");
		
	}
}
