package com.training;

public class DVD extends MediaTypes {
private double runningTime;

	public DVD(String title,String author,String subject,double runningTime,int volumeNumber,double rating,double lendingLength)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setSubject(subject);
		this.runningTime=runningTime;
		this.setVolumeNumber(volumeNumber);
		this.setRating(rating);
		this.setLendingLength(lendingLength);
	}

	public double getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(double runningTime) {
		this.runningTime = runningTime;
	}

	




}
