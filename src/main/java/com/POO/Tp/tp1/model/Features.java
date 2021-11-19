package com.POO.Tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Features {
	public Properties properties;
	public Geometry geometry;

	@Override
	public String toString() {
		return "Features [properties=" + properties + ", geometry=" + geometry + "]";
	}

	
}
