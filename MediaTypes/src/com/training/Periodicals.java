package com.training;

public class Periodicals extends MediaTypes {
	
	
	public Periodicals(String title, String subject, int volumeNumber,
			double rating, double lendingLength) {
		
		this.setTitle(title);
		this.setSubject(subject);
		this.setVolumeNumber(volumeNumber);
		this.setRating(rating);
		this.setLendingLength(lendingLength);
	}
}
