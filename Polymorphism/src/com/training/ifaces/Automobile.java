package com.training.ifaces;

/*
 * @author Diwakar
 * Top leveln interface for representing automobile
 * @version 1.0
 */

public interface Automobile {
public static final String SHOWROOM_NAME="Ramesh cars";

/*
 *All the methods in the interface are public and abstract 
 */

 public abstract double getPrice();
 public String getColour();
 String getModel();
 
	
}
