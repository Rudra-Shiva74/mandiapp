package com.mandi.fertilizer.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class FertilizerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String name;
	@NotNull
	private int qnt;
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date date;
	@NotNull
	private int price;
	private String image;
	@NotNull
	private String farmerid;
	@NotNull
	private String state;
	@NotNull
	private String breed;

	@Override
	public String toString() {
		return "FertilizerInfo [id=" + id + ", name=" + name + ", qnt=" + qnt + ", date=" + date + ", price=" + price
				+ ", image=" + image + ", farmerid=" + farmerid + "]";
	}

	public long getId() {
		return id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

}
