package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book  extends Media {
	private String content;
	ArrayList<String> contentTokens = new ArrayList<String>();
	Map<String,Integer> wordFrequency = new TreeMap<String, Integer>();
	public Book(String title, String category, float cost,String content) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
		this.content = content;
	}
	
	private List<String> authors = new ArrayList<String>();
	
	public String getContent() {
		return this.content;
	}
	
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
	}
	public void processContent() {
//		String[] tmp = this.content.split(" ");
//		for (int i = 0 ; i < tmp.length; i++) {
//			System.out.println("  " + tmp[i]);
//		}
		String[] abc = {};
		String[] tmp1;
		String tg = "";
		int d = 0;
		String tmp = this.content;
		for (int i = 0 ; i < tmp.length(); i++) {
			if ((tmp.charAt(i) >= 0 && tmp.charAt(i) <= 64 ) || 
					(tmp.charAt(i) >=123 && tmp.charAt(i)<= 244) ||
					(tmp.charAt(i) >= 91 && tmp.charAt(i)<= 96)) 
			{
				d++;
				tg = tg + tmp.charAt(i);
				tmp1 = tmp.split(tg, 2);
				abc[d] = tmp1[0];
				tmp = tmp1[1];
			}
		}
		for (int i = 0 ; i < abc.length ; i++) {
			if (!contentTokens.contains(abc[i])) {
				contentTokens.add(abc[i]);
				wordFrequency.put(abc[i], 1);
			} 
			else {
				wordFrequency.replace(abc[i], wordFrequency.get(abc[i]), wordFrequency.get(abc[i])+1);
			}
		}	
	}
	public String toString() {
		String s = "";
		Collections.sort(contentTokens);
		Iterator<String> iterator = contentTokens.iterator();
		while (iterator.hasNext()) {
			s = s+ iterator.next();
		}
		return s;
	}
}
