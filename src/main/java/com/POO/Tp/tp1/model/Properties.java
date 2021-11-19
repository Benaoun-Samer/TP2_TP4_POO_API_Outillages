package com.POO.Tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
	
	public String x;
	public String y;
	public String city;
	public String street;
	public String citycode;
	public String name;
	
	
	@Override
	public String toString() {
		return "JsonProperties [x=" + x + ", y=" + y + ", city=" + city + ", street=" + street + ", citycode="
				+ citycode + ", name=" + name + "]";
	}
	
	
}
