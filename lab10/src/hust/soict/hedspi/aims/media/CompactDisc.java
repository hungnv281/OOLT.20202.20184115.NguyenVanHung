package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.PlayerException;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>(); 
	
	public String getArtist() {
		return this.artist;
	}

	
	public CompactDisc(String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	 public void addTrack(String title, int length){
	        Track track = new Track(title,length);
	        tracks.add(track);
	    }

	public void addTrack(Track track ) {
		for (int i = 0 ; i < tracks.size() ;i++ ) {
			if (tracks.get(i).getTitle().equals(track.getTitle())) {
				return;
			}
		}
		tracks.add(track);
		System.out.println("add completed! ");
	}
	public void removeTrack(Track track) {
		for (int i = 0 ;  i < tracks.size(); i++) {
			if (tracks.get(i).getTitle().equals(track)) {
				tracks.remove(i);
			} else {
				System.out.println("can't remove !");
			}
		}
	}
	public int getLength() {
		int totalLength = 0;
		for (int i = 0 ; i < tracks.size() ; i++ ) {
			totalLength += tracks.get(i).getLength();
		}
		return totalLength;
	}

	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0 ) {
			System.out.println(" Artist of track : " +this.getArtist());
			System.out.println(" Category of track : " + this.getCategory());
			System.out.println(" Cost of track : " + this.getCost());
			System.out.println(" Length of track : " + this.getLength());
			System.out.println(" Title of track :  " + this.getTitle());
		}
		else {
			throw new PlayerException("Error !!!");
		}
	}
	public void printListTracks() {
		for (int i = 0 ; i < tracks.size() ; i++) {
			try {
				tracks.get(i).play();
			} catch (PlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int compareTo(Object obj) {
		CompactDisc media = (CompactDisc)obj;
		if (media == null ) {
			System.out.println("Error !!!");
			return -2;
		}
		if (this.tracks.size() < media.tracks.size()) {
			return -1;
		}
		else if (this.tracks.size() > media.tracks.size()) {
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
