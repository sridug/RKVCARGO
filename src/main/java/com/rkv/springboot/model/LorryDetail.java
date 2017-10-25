package com.rkv.springboot.model;

public class LorryDetail {
	private Integer lorryNumber;
	private String lorryName;
	private String lorryOwner;
	private Integer owenerPhone;

	public Integer getLorryNumber() {
		return lorryNumber;
	}

	public void setLorryNumber(Integer lorryNumber) {
		this.lorryNumber = lorryNumber;
	}

	public String getLorryName() {
		return lorryName;
	}

	public void setLorryName(String lorryName) {
		this.lorryName = lorryName;
	}

	public String getLorryOwner() {
		return lorryOwner;
	}

	public void setLorryOwner(String lorryOwner) {
		this.lorryOwner = lorryOwner;
	}

	public Integer getOwenerPhone() {
		return owenerPhone;
	}

	public void setOwenerPhone(Integer owenerPhone) {
		this.owenerPhone = owenerPhone;
	}

}
