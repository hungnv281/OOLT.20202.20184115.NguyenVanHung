package lab4;

public class TestPassingParameter {
	
	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		discccc a = new discccc(jungleDVD);

		discccc b = new discccc(cinderellaDVD);
		System.out.println("jungle dvd title : " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title : " + cinderellaDVD.getTitle());
		swap(a,b);
		
//		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle dvd title : " + a.disc.getTitle());

	}
	 public static void swap (discccc disc1 , discccc disc2) {
		 DigitalVideoDisc tg = disc1.disc;
		 disc1.disc = disc2.disc;
		 disc2.disc = tg;
	 }
	
	public static void changeTitle(DigitalVideoDisc dvd , String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
}
