package com.POO.Tp.tp1.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class forecast {
	public String datetime;
	public float tmin;
	public float tmax;
	public float wind10m;


	@Override
	public String toString() {
		return "Item [datetime=" + datetime + ", tmin=" + tmin + ", tmax=" + tmax + ", wind10m=" + wind10m + "]";
	}


	
}
