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

package names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task2 {
	
	private static List<String> names = Arrays.asList(
			"Amelia",
			"Olivia",
			"emily",
			"Isla",
			"Ava",
			"oliver",
			"Jack",
			"Charlie",
			"harry",
			"Jacob"
			);
	
	
	public static List<String> capitalize(){
		 List<String> templist = new ArrayList<>();
		for(String name : names)
		{
			templist.add(name.substring(0, 1).toUpperCase() + name.substring(1));
		}
	
		return templist;
	}
	
	public static List<String> display(List<String> tempname) {
	List<String> sorted = tempname;
	Collections.sort(sorted);
	
	return sorted;
	}
	
	public static void main(String[] args) {
		
		display(capitalize()).forEach(temp -> { System.out.print(temp + "\n");  
		
		});
	}
	
}
	
