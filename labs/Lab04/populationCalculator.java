/*
Name: Jonathan McFadden
Assignment: #4
Title: Population Calculator
Course: CSCE 144
Class Section: 2
Lab Section: 1
Semester: Spring 2004
Instructor: Edison
Date: Feburay 26, 2004
Sources consulted: [none]
Program description: This program estimated furture populations and population growth rates
using the LN X function and two base time periods and populations.
*/
import javax.swing.* ;
import java.text.* ;
import java.math.* ;
import java.io.* ;

public class populationCalculator {
	public static void main ( String [] arg ) throws IOException {
	
		
		System.out.println();
		System.out.println ("This program will estimate future population values \n" +
								  "and a population growth rate based on two time periods \n" +
								  "(time A and time B) and the populations during those \n" +
								  "years (Population A and Population B.");
								  
		System.out.println();
		
		//get input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input time A: ");
		String iTimeA = br.readLine();
				
		System.out.print("Input population A: ");
		String iPopA = br.readLine();

		System.out.print("Input time B: ");
		String iTimeB = br.readLine();
		
		System.out.print("Input populatoin B: ");
		String iPopB = br.readLine();
		
		System.out.print("Input time C: ");
		String iTimeC = br.readLine();
		
		System.out.println();
		
		//calculate output
		
		double timeA = Double.parseDouble(iTimeA);
		double timeB = Double.parseDouble(iTimeB);
		double timeC = Double.parseDouble(iTimeC);
		double popA = Double.parseDouble(iPopA);
		double popB = Double.parseDouble(iPopB);
				
		double growthConstant = (1 / (timeB - timeA) ) * (Math.log(popB / popA));
		double popC = popA * Math.exp( ( growthConstant * (timeC - timeA) ) );
		
		int populationC = (int) popC; //remove decimal from popC
		
		System.out.println();
		//display output
		System.out.print("Growth Factor Calculated : " + growthConstant + " \n" + "\n" +
							  "Input		Year		Population \n" +
							  "A		"+iTimeA+"	        "+iPopA+" \n" +
							  "B		"+iTimeB+"	        "+iPopB+" \n" + "\n" +
							  "C		"+iTimeC+"	        "+populationC+" (estimate) \n" +
							  "\n" +
							  "\n" +	
							  "Time A input:               " + iTimeA + " \n" +
							  "Time B input:               " + iTimeB + " \n" +
							  "Time C input:               " + iTimeC + " \n" +
							  "\n" +
							  "Population A inupt:         " + iPopA + " \n" +
							  "Population B input:         " + iPopB + " \n" +
							  "Population C estimate:      " + populationC + " \n" +
							  "\n" +
							  "Growth Constant Calculated: " + growthConstant + " ");
							  
							  
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.exit(0);
		
		}//end main
	}// end populaitonCalculator