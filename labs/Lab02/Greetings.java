/*
Name: Jonathan McFadden
Assignment: #2 part 2
Title: Hello World
Course: CSCE 144
Class Section: 2
Lab Section: 1
Semester: Spring 2004
Instructor: Edison
Date: Feburay 12, 2004
Sources consulted: [none]
Program description: This program takes the name that is input and inserts it into a string that will display a greeting.
*/

import javax.swing.* ;
public class Greetings {
	public static void main ( String [] arg ) {
		
		String fullName;
		fullName = JOptionPane.showInputDialog(null, "What is your full name?");
		
		String space;
		space = (" ");
		
		String firstName;
		firstName = fullName.substring(0, fullName.indexOf(space) ) ;
				
		String greeting = "Nice to meet you, " + firstName + ".  Have a nice day." ;
		
		JOptionPane.showMessageDialog( null, greeting ) ;
		
		System.exit(0) ;
		
		} // endmain
	}// end Greetings
	