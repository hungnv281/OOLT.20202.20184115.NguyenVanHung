package hust.soict.hedspi.aims.media;

public class Track extends Object implements Playable{
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
	public Track() {
		
	}
	@Override
	public boolean equals(Object obj) {
		Track checkTrack = new Track();
		checkTrack = (Track)obj; 
		if (checkTrack == null ) {
			System.out.println("00000000");
			return false;
		} 
		if ((checkTrack.getLength() == this.length) &&(checkTrack.getTitle() == this.title)) {
			return true ;
		}
		return false;
	}
}
