package hust.soict.hedspi.test.book;

import java.util.Iterator;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class BookTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println("enter 1 to add a book ! ");
		order.addMedia();
		
		Iterator<Book> iterator =  order.booksOrdered.iterator();
		
		while (iterator.hasNext()) {
			Book element = iterator.next();
			element.processContent();
			System.out.println(element.toString());
		}
	}

}
