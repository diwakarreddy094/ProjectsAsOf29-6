package com.training.domain;

import com.training.ifaces.Automobile;

public class HondaBike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 80000.0;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Unicorn";
	}
}
