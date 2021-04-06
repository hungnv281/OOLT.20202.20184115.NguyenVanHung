package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	protected ArrayList<String> titleList = new ArrayList<String>();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public ArrayList<String> getTitleList() {
		return titleList;
	}
	public void setTitleList(ArrayList<String> titleList) {
		this.titleList.addAll(titleList);
	}
	
	
}
