package org.fkit.domain;

public class Evaluate {
	private int id;
	private int order_sn;
	private  int good_sn;
	private int user_sn;
	private String text;
	private String image;
	private int point;
	private int point2;
	private int point3;
	public int getPoint2() {
		return point2;
	}
	public void setPoint2(int point2) {
		this.point2 = point2;
	}
	public int getPoint3() {
		return point3;
	}
	public void setPoint3(int point3) {
		this.point3 = point3;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder_sn() {
		return order_sn;
	}
	public void setOrder_sn(int order_sn) {
		this.order_sn = order_sn;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Evaluate [id=" + id + ", order_sn=" + order_sn + ",  good_sn=" + good_sn + ", user_sn=" + user_sn
				+ ",text=" + text + ",image=" + image + ",point="+point+",point2="+point2+",point3="+point3+"]";
}
}
