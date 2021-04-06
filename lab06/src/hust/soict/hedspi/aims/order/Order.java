
package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	 public Order(){
        super();
    }
    public void addMedia(Media media){
        if (!(itemsOrdered.contains(media))) {
            itemsOrdered.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        }
    }
    public void printItemOrder() {
    	for (int i = 0 ; i < itemsOrdered.size(); i++) {
    		System.out.println("\nID : " + itemsOrdered.get(i).getId());
    		System.out.println("\ncategory : " + itemsOrdered.get(i).getCategory());
    		System.out.println("\ncost : " + itemsOrdered.get(i).getCost());
    		System.out.println("\ntitle : " + itemsOrdered.get(i).getTitle());
    	}
    }
}


