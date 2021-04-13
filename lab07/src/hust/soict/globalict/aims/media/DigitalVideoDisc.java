package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title, String category, float cost, int length,
			String director) {
		super(title, category, cost, length, director);
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
	
}
