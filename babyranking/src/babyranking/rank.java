/**********************************************
Workshop #4
Course: JAC444 - 4
Last Name: PARPIA
First Name: AQEEL
ID: 127921161
Section: JAC444SEE
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<APRIL  4 >
**********************************************/

package babyranking;

import java.util.Scanner;
import java.io.*;

public class rank {

	private static int year;
	private Scanner x;
	
	public void openFile(int year)
	{
		if( year > 2000 && year < 2011  ) {
			try {
				x = new Scanner(new File("babynamesranking" + year + ".txt"));
			}
			catch(Exception e){
				System.out.println("File opening error");
			}
		}
		
		else {
			System.out.println("Couldn't find file");
		}
	}
	
	
	public void readFile(String gender, String name,int year)
	{
		if(gender.equalsIgnoreCase("m"))
		{
			while(x.hasNext()) 
		  {
			String rank = x.next();
			String nam = x.next();
			x.nextLine();
			if(nam.equalsIgnoreCase(name))
			{
				System.out.printf("Boy name %s is ranked #%s in year %d ",nam,rank,year);
			}
		  }
		}
		else if(gender.equalsIgnoreCase("f"))
		{
			while(x.hasNext())
			{
				String rank = x.next();
				String mnam = x.next();
				String num = x.next();
				String fnam = x.next();
				x.nextLine();
				if(fnam.equalsIgnoreCase(name))
				{
					System.out.printf("Girl name %s is ranked #%s in year %d ",fnam,rank,year);
				}
			}
		}
		else { 
			System.out.println("Incorrect gender");
		}
	}
	
	
	public static void main(String args[]) {
		rank p = new rank();
		Scanner y = new Scanner(System.in);
		String gender="";
		String confirm = "y";
		
		while(confirm.equalsIgnoreCase("y")) {
		System.out.print("Enter the year: ");
		int year = y.nextInt();
		p.openFile(year);
		
		System.out.print("Enter the gender: ");
		gender = y.next();
		System.out.print("Enter the name: ");
		String name = y.next();
		
		p.readFile(gender,name,year);
		
		
		System.out.println(" ");
		System.out.print("Enter another inquiry?: ");
		confirm = y.next();
		
	
		}
		
		if(confirm != "y")  {
			System.out.print("Goodbyee :) ");
		}
	}
	
	
}
