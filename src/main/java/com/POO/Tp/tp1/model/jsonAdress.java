package com.POO.Tp.tp1.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class jsonAdress {
	public String type;
	public String version;
	public Features[] features;
	
	
	


	@Override
	public String toString() {
		return "jsonAdress [type=" + type + ", version=" + version + ", features=" + Arrays.toString(features) + "]";
	}


	
	
	

}
