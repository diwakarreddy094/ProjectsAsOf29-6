package com.training;

public class Books extends MediaTypes {
	private int isbn;
	
	public Books(String title,String author,String subject,int isbn,int volumeNumber,double rating,double lendingLength)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setSubject(subject);
		this.isbn=isbn;
		this.setVolumeNumber(volumeNumber);
		this.setRating(rating);
		this.setLendingLength(lendingLength);
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	

}
