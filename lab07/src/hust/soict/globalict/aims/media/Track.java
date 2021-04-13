package hust.soict.globalict.aims.media;

public class Track implements Playable{
	private String title;
	private  int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	@Override
	public void play() {
		System.out.println(" Name of track : " + this.getTitle() );
		System.out.println("Length of track : " + this.getLength());
		
	}
	
}
