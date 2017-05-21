/*
Name: Jonathan McFadden
Assignment: #2 part 1
Title: Hello World
Course: CSCE 144
Class Section: 2
Lab Section: 1
Semester: Spring 2004
Instructor: Edison
Date: Feburay 12, 2004
Sources consulted: [none]
Program description: This program dispalys the string "Hello World!"
*/

import javax.swing.* ;
public class HelloWorld {
	public static void main ( String [] arg ) {
		
		String greeting = "Hello World!" ;
		
		JOptionPane.showMessageDialog( null, greeting ) ;
		
		System.exit(0) ;
		
		} // endmain
	}// end HelloWorld
	