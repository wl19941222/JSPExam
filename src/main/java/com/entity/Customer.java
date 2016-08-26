package com.entity;

public class Customer extends IDEntity {

	private String first_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", id=" + id + "]";
	}

}
