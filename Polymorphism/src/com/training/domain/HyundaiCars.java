package com.training.domain;

import com.training.ifaces.Automobile;

public class HyundaiCars implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10000000;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "milky white";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "verna";
	}

}
