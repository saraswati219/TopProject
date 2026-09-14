package com.app.model;

public class Address {
	private String cityname;
	private String pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", pincode=" + pincode + "]";
	}
	
	

}
