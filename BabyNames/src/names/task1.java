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


import java.util.List;
import java.util.*;

public class task1 {

	private List<String> names = Arrays.asList(
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
		
		public void capitalize(){
			
			for(int i=0; i < names.size(); i++)
			{
				names.set(i, (names.get(i).substring(0, 1).toUpperCase() + names.get(i).substring(1)));
			}
		
		}
		
		public void display() {
		Collections.sort(names);
		names.forEach(temp -> System.out.print(temp + "\n")	);
		}
		
		public static void main(String[] args) {
			task1 name = new task1();
			name.capitalize();
			name.display();
		}


}

