package com.training.domain;

import com.training.ifaces.Automobile;

public  class MarutiCars implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000.0;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "SwiftDezire";
	}
	


}
