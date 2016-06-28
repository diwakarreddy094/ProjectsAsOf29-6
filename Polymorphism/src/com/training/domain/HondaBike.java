package com.training.domain;

import com.training.ifaces.Automobile;

public class HondaBike implements Automobile {

	
	/*
	 * Constructors
	 */
	
	public HondaBike() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Method to get price of vehicle(non-Javadoc)
	 * @see com.training.ifaces.Automobile#getPrice()
	 */
	@Override
	public double getPrice() 
	{
		// TODO Auto-generated method stub
		return 80000.0;
	}

	
	/*
	 * returns color of the vehicle
	 */
	@Override
	public String getColour() 
	{
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String getModel()
	{
		// TODO Auto-generated method stub
		return "Unicorn";
	}
}
