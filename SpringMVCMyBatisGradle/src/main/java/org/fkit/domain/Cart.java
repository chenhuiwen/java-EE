package org.fkit.domain;


public class Cart{
	private Integer id;
	private String name;
	private Double price;
	private String image;
	private String user_sn;
	private String good_sn;
	private Integer count;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getGood_sn() {
		return good_sn;
	}
	public void setGood_sn(String good_sn) {
		this.good_sn = good_sn;
	}
	public Cart(){
		super(); 

}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUser_sn() {
		return user_sn;
	}
	public void setUser_sn(String user_sn) {
		this.user_sn = user_sn;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ",  price=" + price + ", image=" + image
				+ ", user_sn="+user_sn+" good_sn="+good_sn+"]";
}
	}
