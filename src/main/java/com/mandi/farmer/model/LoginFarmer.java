package com.mandi.farmer.model;

public class LoginFarmer {
	private String farmerid;
	private String farmerpassword;

	public LoginFarmer(String farmerid, String farmerpassword) {
		super();
		this.farmerid = farmerid;
		this.farmerpassword = farmerpassword;
	}

	public String getFarmerid() {
		return farmerid;
	}

	public void setFarmerid(String farmerid) {
		this.farmerid = farmerid;
	}

	public String getFarmerpassword() {
		return farmerpassword;
	}

	public void setFarmerpassword(String farmerpassword) {
		this.farmerpassword = farmerpassword;
	}

	@Override
	public String toString() {
		return "LoginFarmer [farmerid=" + farmerid + ", farmerpassword=" + farmerpassword + "]";
	}

	public LoginFarmer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
