package com.POO.Tp.tp1.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
	public double[] coordinates ;


	@Override
	public String toString() {
		return "Geometry [coordinates=" + Arrays.toString(coordinates) + "]";
	}
	

}
