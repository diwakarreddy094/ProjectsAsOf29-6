package com.training;

public class Celsius2faren {

	
private  double temp;
	

	public Celsius2faren(double temperature) {
		super();
		this.temp = temperature;
	}


	public double getTemp() {
		return temp;
	}


	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double convert2Faren()
	{
		return getTemp()*3.07;
	}


}
