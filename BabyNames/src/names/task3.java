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

import java.util.Arrays;
import java.util.List;


public class task3 {

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
	
	public static void display() {
		names.stream().sorted(String::compareToIgnoreCase)
		.map(name -> name = name.substring(0, 1).toUpperCase() + name.substring(1))
		.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		display();
		};
	
}