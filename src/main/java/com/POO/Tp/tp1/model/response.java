package com.POO.Tp.tp1.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class response {
	public City city;
	public forecast[] forecast;
	
	@Override
	public String toString() {
		return "response [city=" + city + ", forecast=" + Arrays.toString(forecast) + "]";
	}
	
	
	
}
