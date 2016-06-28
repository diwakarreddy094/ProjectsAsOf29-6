package com.training;

public class Dollar2Rupees {

	private double amount;
	

	public Dollar2Rupees(double amount) {
		super();
		this.amount = amount;
	}


	public double getAmount() {
		return amount;
	}
	
	public double convert2rupees()
	{
		return amount*67.89;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}

 

}
