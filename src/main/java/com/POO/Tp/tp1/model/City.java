package com.POO.Tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	public String name;
	public float latitude;
	public float longitude;
	
	

	@Override
	public String toString() {
		return "City [name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
