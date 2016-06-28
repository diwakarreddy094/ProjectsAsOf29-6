package com.training;

public abstract class MediaTypes {
 private  String author;
 private String title;
 private String subject;

 private int volumeNumber;
 private double rating;
 private double lendingLength;
 
 
public MediaTypes() {
	super();
	// TODO Auto-generated constructor stub
}
public MediaTypes(String author, String title, String subject, int iSBN, double runningTime, int volumeNumber,
		double rating, double lendingLength) {
	super();
	this.author = author;
	this.title = title;
	this.subject = subject;
	this.volumeNumber = volumeNumber;
	this.rating = rating;
	this.lendingLength = lendingLength;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}



public int getVolumeNumber() {
	return volumeNumber;
}
public void setVolumeNumber(int volumeNumber) {
	this.volumeNumber = volumeNumber;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public double getLendingLength() {
	return lendingLength;
}
public void setLendingLength(double lendingLength) {
	this.lendingLength = lendingLength;
}
 
 
}
