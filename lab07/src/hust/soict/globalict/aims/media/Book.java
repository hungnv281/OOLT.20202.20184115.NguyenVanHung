package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book  extends Media{

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	private List<String> authors = new ArrayList<String>();
	
	
	public void addAuthor(String authorName) {
		if (authors.indexOf(authorName) == -1 ) {
			authors.add(authorName);
		} else {
			System.out.println("da ton tai !");
		}
	}
	
	protected void removeAuthor (String authorName) {
		if (authors.indexOf(authorName) != -1) {
			authors.remove(authorName);
		} else {
			System.out.println("khong ton tai !");
		}
	};
}
