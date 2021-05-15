
package hust.soict.hedspi.aims.order;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import hust.soict.hedspi.aims.PlayerException;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Order {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public ArrayList<Book> booksOrdered = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
    public static final int MAX_NUMBERS_ORDERED = 10;
	
	 public Order(){
        super();
    }
    public void addMedia(Media media){
        if (!(itemsOrdered.contains(media))) {
            itemsOrdered.add(media);
        }
    }
    
    public void removeMedia(int id) {
        //
        itemsOrdered.remove(id);
    }
    
    public void removeMedia() {
        String title;
        if (itemsOrdered.size() == 0) {
            System.out.println("Order empty!");
            return;
        }
        System.out.print("Enter the title of media you want to delete: ");
        title = sc.nextLine();
        int j=0;
        for (int i=0;i<itemsOrdered.size();i++) {
            if (title.equals(itemsOrdered.get(i).getTitle())) {
                itemsOrdered.remove(i);
                j++;
            }
        }
        if(j>0){
            System.out.println("Delete finish");
        }
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        }
    }
    public void addMedia() {
        int choose;
        System.out.print("book enter 1,dvd enter 2,cd enter 3: ");
        choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                
                System.out.print("Title: ");
                String bTitle = sc.nextLine();
                System.out.print("Catelogy: ");
                String bCategory = sc.nextLine();
                System.out.print("Cost: ");
                float bCost = sc.nextFloat();
                System.out.println("Content: ");
                
                String content = sc.nextLine();sc.nextLine();
                Book book = new Book(bTitle,bCategory,bCost,content);
                System.out.print("how many authors:");
                int ath = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= ath; i++) {
                    System.out.print("Author " + i + ": ");
                    book.addAuthor(sc.nextLine());
                }
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 1) {
                        itemsOrdered.add(book);
                        booksOrdered.add(book);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                book.processContent();
                System.out.println(book.toString());
                break;
               
               //return book;
            case 2:
                
                System.out.print("Title: ");
                String dvdTitle = sc.nextLine();
                System.out.print("Catelogy: ");
                String dvdCategory = sc.nextLine();
                System.out.print("Director: ");
                String dvdDirectory = sc.nextLine();
                System.out.print("Length: ");
                int dvdLength = sc.nextInt();
                System.out.print("Cost:");
                float dvdCost = sc.nextFloat();
//                System.out.println("director : ");
//                String dvdDirector = sc.nextLine();
//                dvdDirector = sc.nextLine();
                DigitalVideoDisc dvd = new DigitalVideoDisc(dvdTitle, dvdCategory, dvdCost, dvdLength, dvdDirectory);
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 2) {
                        itemsOrdered.add(dvd);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                System.out.println("you want to play DVD(enter 1 to play): ");
                int choose2 = 0;
                choose2 = sc.nextInt();
                switch (choose2) {
                    case 1:
					try {
						dvd.play();
					} catch (PlayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        break;
                    default:
                        break;
                }
                break;
            case 3:
            	
                System.out.print("Title: ");
                String cdTitle = sc.nextLine();
                System.out.print("Catelogy: ");
                String cdCategory = sc.nextLine();
                System.out.print("Director: ");
                String cdDirectory = sc.nextLine();
                System.out.print("Length: ");
                int cdLength = sc.nextInt();
                System.out.print("Cost: ");
                float cdCost = sc.nextFloat();
                System.out.print("Artist: ");
                sc.nextLine();
                String cdArtist = sc.nextLine();
                CompactDisc compactDisc = new CompactDisc(cdTitle, cdCategory, cdCost, cdLength, cdDirectory, cdArtist, null);
                System.out.print("How many Track? ");
                int track = sc.nextInt();
                sc.nextLine();
                for (int i = 1; i <= track; i++) {
                    System.out.print("Title of track "+i+":");
                    String titleTrack= sc.nextLine();
                    System.out.print("Length of track "+i+":");
                    int lengthTrack=sc.nextInt();
                    compactDisc.addTrack(titleTrack,lengthTrack);
                    sc.nextLine();
                }
                
                if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                    if (choose == 3) {
                        itemsOrdered.add(compactDisc);
                    } else {
                        System.out.println("maximum " + MAX_NUMBERS_ORDERED + " products in 1 ordered");
                    }
                }
                System.out.println("you want to play CD(enter 1 to play): ");
                int choose3 = 0;
                choose3 = sc.nextInt();
                switch (choose3) {
                    case 1:
					try {
						compactDisc.play();
					} catch (PlayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        break;
                    default:
                        break;
                }
                break;
                //return compactDisc;
            default:
                System.out.println("Input error");
                break;
        }
    }

    public void printItemOrder() {
    	for (int i = 0 ; i < itemsOrdered.size(); i++) {
//    		System.out.println("\nID : " + itemsOrdered.get(i).getId());
    		System.out.println("\ncategory : " + itemsOrdered.get(i).getCategory());
    		System.out.println("\ncost : " + itemsOrdered.get(i).getCost());
    		System.out.println("\ntitle : " + itemsOrdered.get(i).getTitle());
    	}
    }
    public double totalCost() {
    	double total = 0;
    	for (int i = 0 ; i < itemsOrdered.size() ; i++) {
    		total +=  itemsOrdered.get(i).getCost();
    	}
    	
    	return total;
    	
    }
    public void printOrdered() {
        for (Media x : itemsOrdered) {
            System.out.println("Media{" +
                    "title='" + x.getTitle() + '\'' +
                    ", category='" + x.getCategory() + '\'' +
                    ", cost=" + x.getCost() +
                    '}');
        }
    }
    
    public Media getItem(int id) {
    	return itemsOrdered.get(id);
    }
    
    
    
    public void getLuckyItem(Order order) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("... enter the lucky number");
    	double luckyNumber = scanner.nextDouble();
    	Random random = new Random();
    	double randomNumber = random.nextDouble();
    	System.out.println(randomNumber);
    	if (luckyNumber > randomNumber) {
    		System.out.println("don't have lucky item !!");
    		return;
    	} else {
    		System.out.println("input the priceLevelNumber");
    		double priceLevelNumber = scanner.nextDouble();
    		System.out.println("input the quantumNumber");
    		int quantumNumber = scanner.nextInt();
    		double total = order.totalCost();
    		int randomItemNumber = 99999;
    		try{
    			randomItemNumber = random.nextInt(order.itemsOrdered.size());
    			System.out.println("the lucky item is " + order.itemsOrdered.get(randomItemNumber).getTitle() 
    				+ " with price = " + order.itemsOrdered.get(randomItemNumber));
    		} catch (IllegalArgumentException e) {
    			e.printStackTrace();
    			System.out.println("error!!");
    		}
    	}
    	
    }
    
}


