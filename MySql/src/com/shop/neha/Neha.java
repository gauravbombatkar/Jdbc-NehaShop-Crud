package com.shop.neha;

public class Neha {
	private int id;
	private String name;
	private String number;
	private String totalBill;
	public Neha(int id, String name, String number, String totalBill) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.totalBill = totalBill;
	}
	public Neha(String name, String number, String totalBill) {
		super();
		this.name = name;
		this.number = number;
		this.totalBill = totalBill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "Neha [id=" + id + ", name=" + name + ", number=" + number + ", totalBill=" + totalBill + "]";
	}
	
	
	
	
}
