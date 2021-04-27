package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title, String category, float cost, int length,
			String director) {
		super(title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc() {
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void play() {
		System.out.println("playing DVD : " + this.getTitle());
		System.out.println("DVD length : " + this.getLength());
	}
	public int compareTo(Object obj) {
		DigitalVideoDisc media = (DigitalVideoDisc)obj;
		if (media == null ) {
			System.out.println("Error !!!");
			return -2;
		}
		if (this.cost > media.getCost()) {
			return 1;
		}
		else if ( this.cost <  media.getCost()) {
			return -1;
		}
		else if ((this.cost == media.getCost()) && (this.length > media.getLength())) {
			return 1;
		}
		else if ((this.cost == media.getCost()) && (this.length < media.getLength())) {
			return -1;
		}else 
		if (this.title.equals(media.getTitle())) {
			return 0;
		} else if (this.title.equals(media.getTitle()) ) {
			return 1;
		} else return -1;
		
	//	return 0;
	}
}
