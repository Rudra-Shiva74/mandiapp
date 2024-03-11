package com.mandi.animal.model;

public class DeleteAnimal {
	private Long id;
	private String farmerid;

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

	@Override
	public String toString() {
		return "DeleteAnimal [id=" + id + ", farmerid=" + farmerid + "]";
	}

}
