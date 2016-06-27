package com.training.apps;

import java.util.Scanner;

import com.training.domain.NewShowRoom;
import com.training.domain.ShowRoom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		String ch;
		int key;
    Scanner sc=new Scanner(System.in);
	do{
		
	
    System.out.println("Enter 1 for Maruti and 2 for Toyota 3 for honda Bike");
     key=sc.nextInt();
    ShowRoom obj=new NewShowRoom();
    Automobile polyauto=obj.getModel(key);
    
    if(polyauto==null)
    	System.out.println("Invalid choice");
    else 
    	 obj.PrintQuote(polyauto);
    
    
    System.out.println("Y to continue and N to exit");
    ch=sc.next();
    
	}while(ch.equalsIgnoreCase("Y"));
		
	sc.close();
 
	}

}
