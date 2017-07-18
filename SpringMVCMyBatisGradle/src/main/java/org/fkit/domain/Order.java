package org.fkit.domain;

import java.util.List;

public class Order {
	private Integer id;
	private List<Good> good;
	private Integer count;
	private Integer good_sn;
	private Integer user_sn;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Good> getGood() {
		return good;
	}
	public void setGood(List<Good> good) {
		this.good = good;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getGood_sn() {
		return good_sn;
	}
	public void setGood_sn(Integer good_sn) {
		this.good_sn = good_sn;
	}
	public Integer getUser_sn() {
		return user_sn;
	}
	public void setUser_sn(Integer user_sn) {
		this.user_sn = user_sn;
	}
	@Override
	public String toString(){
		return "order[id="+id+",good="+good+",count="+count+",good_sn="+good_sn+",user_sn="+user_sn+","
				+ "state="+state+"]";
	}
}
