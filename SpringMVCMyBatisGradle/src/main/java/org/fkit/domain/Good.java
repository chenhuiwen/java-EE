package org.fkit.domain;


public class Good {
	private Integer id;
	private String name;
	private Double price;
	private String image;
	private String image2;
	private String image3;
	private String remark;
	private String parent_category_sn;
	private Integer count;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Good(){
		super();
		
	}
	public Integer getId() {
		return id;
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
	public void setImage(String image1) {
		this.image = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getParent_category_sn() {
		return parent_category_sn;
	}
	public void setParent_category_sn(String parent_category_sn) {
		this.parent_category_sn = parent_category_sn;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ",  price=" + price + ", image=" + image
				+ ",image2=" + image2 + ",image3=" + image3 + ", remark=" + remark + ",parent_category_sn="+parent_category_sn+",count="+count+"]";
}
	public void setId(Integer id) {
		this.id = id;
	}
	}
