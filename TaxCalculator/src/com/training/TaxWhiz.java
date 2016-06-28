package com.training;

public class TaxWhiz {
private double CurrentTaxRate;
private double SurchargeRate;

public TaxWhiz() {
	super();
	// TODO Auto-generated constructor stub
}

public TaxWhiz(double currentTaxRate, double surchargeRate) {
	super();
	CurrentTaxRate = currentTaxRate;
	SurchargeRate = surchargeRate;
}

public double getCurrentTaxRate() {
	return CurrentTaxRate;
}

public void setCurrentTaxRate(double currentTaxRate) {
	CurrentTaxRate = currentTaxRate;
}

public double getSurchargeRate() {
	return SurchargeRate;
}

public void setSurchargeRate(double surchargeRate) {
	SurchargeRate = surchargeRate;
}

public  double CalcTax(double Amount)
{
	return (Amount*CurrentTaxRate/100+Amount+Amount*CurrentTaxRate/100*SurchargeRate/100);
}
}
