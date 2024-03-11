package com.mandi.farmer.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class FarmerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Column(unique = true)
	private String farmerid;
	@NotNull
	private String name;
	@NotNull
	@Column(unique = true)
	private String email;
	@NotNull
	private String password;
	@NotNull
	private String number;
	@NotNull
	@Column(unique = true)
	private String farmeradhar;
	private String image;
	@NotNull
	private String diss;
	@NotNull
	private String state;
	@NotNull
	private String mandiname;
	@NotNull
	private String latitude;
	@NotNull
	private String longitute;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFarmerid() {
		return farmerid;
	}

	public void setFarmerid(String farmerid) {
		this.farmerid = farmerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFarmeradhar() {
		return farmeradhar;
	}

	public void setFarmeradhar(String farmeradhar) {
		this.farmeradhar = farmeradhar;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDiss() {
		return diss;
	}

	public void setDiss(String diss) {
		this.diss = diss;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMandiname() {
		return mandiname;
	}

	public void setMandiname(String mandiname) {
		this.mandiname = mandiname;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitute() {
		return longitute;
	}

	public void setLongitute(String longitute) {
		this.longitute = longitute;
	}

	@Override
	public String toString() {
		return "FarmerInfo [id=" + id + ", farmerid=" + farmerid + ", name=" + name + ", email=" + email + ", password="
				+ password + ", number=" + number + ", farmeradhar=" + farmeradhar + ", image=" + image + ", diss="
				+ diss + ", state=" + state + ", mandiname=" + mandiname + ", latitude=" + latitude + ", longitute="
				+ longitute + ", date=" + date + "]";
	}

	public FarmerInfo(Long id, @NotNull String farmerid, @NotNull String name, @NotNull String email,
			@NotNull String number, @NotNull String farmeradhar, String image, @NotNull String diss,
			@NotNull String state, @NotNull String mandiname, @NotNull String latitude, @NotNull String longitute,
			Date date) {
		super();
		this.id = id;
		this.farmerid = farmerid;
		this.name = name;
		this.email = email;
		this.number = number;
		this.farmeradhar = farmeradhar;
		this.image = image;
		this.diss = diss;
		this.state = state;
		this.mandiname = mandiname;
		this.latitude = latitude;
		this.longitute = longitute;
		this.date = date;
	}

	public FarmerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
