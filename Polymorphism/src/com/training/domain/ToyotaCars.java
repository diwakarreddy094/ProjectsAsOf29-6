package com.training.domain;

import com.training.ifaces.Automobile;

public class ToyotaCars implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.0;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Corolla";
	}

}
