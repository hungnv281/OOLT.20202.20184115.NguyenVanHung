package lab3;

public class Order {
	public static int qtyOrder;
	public static final int MAX_NUMBERS_ORDERED = 10;
	private static DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if (qtyOrder > 10) {
			System.out.println("don hang da day !");
		} else if (qtyOrder == 10) {
			System.out.println("don hang sap day !");
		} else {
			qtyOrder++;
			itemsOrdered[qtyOrder] = disc;
			System.out.println(itemsOrdered[qtyOrder].getCost());
		}
	}
	
	public static void removeDigitalVideoDisc  ( DigitalVideoDisc disc) {
		int c= 1;
		for (int i = 1 ; i <=  qtyOrder ; i++) {
			if (itemsOrdered[i] != disc ) {
				itemsOrdered[c] = itemsOrdered[i];
				c++;
			}
		}
		qtyOrder=c-1;
		System.out.println("xoa thanh cong " + disc.getTitle());
		System.out.println(" cac dia con lai la  ");
		for (int i = 1; i<=qtyOrder; i++) {
			System.out.print(itemsOrdered[i].getTitle()+ "   ");
			System.out.println();
		}
	}
	public static void hienThi() {
		
	}
	
	public void totalCost() {
		float total = 0;
		for (int i = 1 ;  i<= qtyOrder; i++) {  
			float t = 0;
			total = total + itemsOrdered[i].getCost();
		}	
		System.out.println("tong gia tien la " + total);
	}
	
	
	
	public static void main(String[] args) {

		Order anOrder = new Order();
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

		removeDigitalVideoDisc(dvd1);
		
		
		anOrder.totalCost();
		removeDigitalVideoDisc(dvd2);
		anOrder.totalCost();
	}

}
