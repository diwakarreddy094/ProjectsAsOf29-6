package com.training.domain;

import com.training.ifaces.Automobile;

public class ShowRoom {
	
	
	
	public Automobile getModel(int key)
	{
		
		switch(key)
		{
		case 1:
			return new MarutiCars();
		case 2:
			return new ToyotaCars();
		case 3:
			return new HyundaiCars();
				
		default:
				return null;
				
		}
		
	}
	
	/**
	 * Method is used to type quotation for different vehicles
	 * @param polyauto
	 */
	public void PrintQuote(Automobile polyauto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
        System.out.println(polyauto.getModel());
        System.out.println(polyauto.getColour());
        System.out.println(polyauto.getPrice());
	}

}
