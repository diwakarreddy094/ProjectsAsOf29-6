package com.training.domain;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getModel(int key)
	{
		
		if(key==3)
			return new HondaBike();
		else
			return super.getModel(key);
				
		
		
	}
}
