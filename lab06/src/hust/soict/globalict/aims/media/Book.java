package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

class Book  extends Media{

	private List<String> authors = new ArrayList<String>();
	
	
	protected void addAuthor(String authorName) {
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
