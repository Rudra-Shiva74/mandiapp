package com.mandi.crops.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class CropsInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String type;

	private String name;

	private int qnt;
	
	private int price;
	
	private String image;
	
	private String farmerid;
	
	private String state;

	private String variety;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFarmerid() {
		return farmerid;
	}

	public void setFarmerid(String farmerid) {
		this.farmerid = farmerid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	@Override
	public String toString() {
		return "CropsInfo [id=" + id + ", type=" + type + ", name=" + name + ", qnt=" + qnt + ", price=" + price
				+ ", image=" + image + ", farmerid=" + farmerid + ", state=" + state + ", variety=" + variety + "]";
	}
	
	
		
	

	

}