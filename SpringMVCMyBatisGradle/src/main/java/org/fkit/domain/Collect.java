package org.fkit.domain;

public class Collect {
	private int id;
	private String good_name;
	private int good_sn;
	private int user_sn;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public int getGood_sn() {
		return good_sn;
	}
	public void setGood_sn(int good_sn) {
		this.good_sn = good_sn;
	}
	public int getUser_sn() {
		return user_sn;
	}
	public void setUser_sn(int user_sn) {
		this.user_sn = user_sn;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", good_name=" + good_name + ",  good_sn=" + good_sn + ", image=" + image
				+ ",user_sn="+user_sn+"]";
}
}
