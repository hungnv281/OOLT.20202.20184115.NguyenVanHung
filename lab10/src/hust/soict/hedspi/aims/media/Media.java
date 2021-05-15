package hust.soict.hedspi.aims.media;

public abstract class Media extends Object implements Comparable{
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}	
	
	public Media() {
	//
	}

	public boolean equals(Object obj) {
		Media checkMedia = new Disc();
		checkMedia = (Disc)obj;
		try{
			checkMedia = (Book)obj;
			if(checkMedia == null) {
				return false;
			} else if(checkMedia.getId() == id) {
				return true;
			}
			if(checkMedia.getId() == id) {
				return true;
			}
			return false;
			
		} catch (NullPointerException exception) {
			exception.printStackTrace();
			return false;
		} catch	(ClassCastException exception) {
			exception.printStackTrace();
			return false;
		}
		
	}
	public int compareTo(Object obj) {
		try{
			Media media = (Media)obj;
		
			if (media == null ) {
				System.out.println("Error !!!");
				return -2;
			}
			if ((this.title.equals(media.getTitle()) == true )&&(this.cost == media.getCost())) {
				return 0;
			} else if ((this.title.equals(media.getTitle()) == false) || (this.cost != media.getCost()) ) {
				return 1;
			} else return -1;
		}catch(ClassCastException exception) {
			exception.printStackTrace();
			return 0;
		} catch (NullPointerException exception) {
			exception.printStackTrace();
			return 0;
		}
		
	}
	public void setNew(Object obj) {
		Media tg = (Media)obj;
		this.category = tg.getCategory();
		this.cost = tg.getCost();
		this.id = tg.getId();
		this.title = tg.getTitle();
	}
}
	
	
