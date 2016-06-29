package com.training;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   MediaTypes dvd=new DVD("Inception","John Cena", "Story", 230, 100, 3.4, 140);
   MediaTypes books=new Books("Deception", "Dan Brown","Thriller", 1410, 200, 4.3, 200);
   MediaTypes periodicals=new Periodicals("CSR","Current Affairs",1014, 4.89,45);
   
    MediaTypes media[]=new MediaTypes[3];
    media[0]=dvd;
    media[1]=books;
    media[2]=periodicals;
   Scanner sc=new Scanner(System.in);
   System.out.println("input 1 to print DVD 2 for books and 3 for periodicals ");
   int choice=sc.nextInt();
   
   switch(choice)
   {
   case 1:
   {
	   {
		   System.out.println("Title"+media[0].getTitle());
		   System.out.println("Author"+media[0].getAuthor());
		   System.out.println("Subject"+media[0].getSubject());
		   System.out.println("Running Time"+media[0].getRunningTime());
	   }
   }
   case 2:
   case 3:
   default :
	   System.out.println("Invalid input");
   
   
   }
   
   
		   

	
	
	}

}
