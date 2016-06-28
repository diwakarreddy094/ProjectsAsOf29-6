package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaxWhiz tax=new TaxWhiz(10, 5);
		System.out.println(tax.CalcTax(1500));
	}

}
