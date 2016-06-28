package com.training;

public class Converter {

	public static void main(String[] args) {
		
		Dollar2Rupees money=new Dollar2Rupees(2);
		Celsius2faren tempe=new Celsius2faren(37);
		
		System.out.println(money.convert2rupees());
		System.out.println(tempe.convert2Faren());

	}
}
