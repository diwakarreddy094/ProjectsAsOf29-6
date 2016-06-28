package com.training;

public class TaxWhiz {
double CurrentTaxRate;
double SurchargeRate;

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

public  double CalcTax(double TaxRate,double SurchargeRate,double Amount)
{
	return (Amount*TaxRate/100+Amount+Amount*TaxRate/100*SurchargeRate/100);
}
}
