/*
Name: Jonathan McFadden
Assignment: #3
Title: Point of sale
Course: CSCE 144
Class Section: 2
Lab Section: 1
Semester: Spring 2004
Instructor: Edison
Date: Feburay 24, 2004
Sources consulted: [none]
Program description: This program computes the amount to charge a person based on the purchase price, sales tax, and commision.
							The program also determines the number of different types of change to give the person.
*/



import javax.swing.* ;
import java.text.* ;
public class PointOfSale {
	public static void main ( String [] arg ) {
		
		String fullName;
		fullName = JOptionPane.showInputDialog ( null, "What is your name?" );
		
		String debitCard;
		debitCard = JOptionPane.showInputDialog ( null, "What is your debit card number? \n Please enter in the form #### #### #### ####" );
		
		String purchasePrice;
		purchasePrice = JOptionPane.showInputDialog ( null, "Enter the price of the purchase in cents." );

		String amountPaid;
		amountPaid = JOptionPane.showInputDialog ( null, "Enter the amount paid in cents." ) ;
		
		String salesTax;
		salesTax = JOptionPane.showInputDialog (null, "Enter the sales tax precentage.");
		
		String commision;
		commision = JOptionPane.showInputDialog (null, "Enter the commision percentage.");
		
			
		
		double salesTaxPercent;
		salesTaxPercent = Double.parseDouble(salesTax) / 100.0;
		double commisionPercent;
		commisionPercent = Double.parseDouble(commision) / 100.0;
		double priceTax;
		priceTax = Double.parseDouble(purchasePrice) * (1 + salesTaxPercent + commisionPercent);
		double priceBeforeTax;
		priceBeforeTax = Double.parseDouble(purchasePrice) / 100.00;
		double taxAmount;
		taxAmount =  Double.parseDouble(purchasePrice) * ( (salesTaxPercent) / 100.0 );
		double commisionAmount;
		commisionAmount =  Double.parseDouble(purchasePrice) * ( (commisionPercent) / 100.0 );
		
		// the preceding 6 doubles were used to computer tax and commision for the post lab creativity.

		int priceInCents; 
		priceInCents = (int) priceTax;
		double priceInDollars;
		priceInDollars = priceInCents / 100.00;
		int paidInCents;
		paidInCents = Integer.parseInt(amountPaid);
		double paidInDollars;
		paidInDollars = paidInCents / 100.00;
		double changeInCents;
		changeInCents = paidInCents - priceInCents;
		double changeInDollars;
		changeInDollars = changeInCents / 100.00;
		
		
		int change;
		change = paidInCents - priceInCents;
		
		
		/* 
		Below, the first ten lines of code are from the post lab 
		to enable the program to compute  the number of 100's, 50's, 
		20's, 10's and 5's to give out.
		*/
		
		
		int number100s = change / 10000;
		int change100s = change % 10000;
		int number50s = change100s / 5000;
		int change50s = change100s % 5000;
		int number20s = change50s / 2000;
		int change20s = change50s % 2000;
		int number10s = change20s / 1000;
		int change10s = change20s % 1000;
		int number5s = change10s / 500;
		int change5s = change10s % 500;
		int number1s = change5s / 100;
		int change1s = change5s % 100;
		int numberQuarters = change1s / 25;
		int changeQuarters = change1s % 25;
		int numberDimes = changeQuarters / 10;
		int changeDimes = changeQuarters % 10;
		int numberNickles = changeDimes / 5;
		int changeNickles = changeDimes % 5;
		int numberPennies = changeNickles;
		
		String lastDebit;
		lastDebit = debitCard.substring(debitCard.length() - 4, debitCard.length() ) ;
		
		
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		
		/* The string "recipt" contains additional code to display the 
		results of the tax and commision parts of the program as well 
		and the extra bills part of the program.  The string "recipt" 
		also has code that dislpays the purchasers name more than once. 
		*/
		
		
		String recipt;
		recipt = "Here is your recipt \n" + 
					"\n" + 
					"This purchase was made by " + fullName + ". \n" + 
					"The Total Price was $" + formatter.format(priceInDollars) + ". \n" +
					"The purchase price before tax and commision was $" + formatter.format(priceBeforeTax) + ". \n" +
					"The tax amount was $" + formatter.format(taxAmount) + ". \n" +
					"The tax percentage was " + salesTax + "%. \n" +
					"The commision amount was $" + formatter.format(commisionAmount) + ". \n" +
					"The commision percentage was " + commision + "%. \n" +
					"The amount paid was $" + formatter.format(paidInDollars) + ". \n" +
					"The amount of change due " + fullName + " is $" + changeInDollars + ". \n" +
					"The number of 100 dollar bills to be given to " + fullName + " is " + number100s + " . \n" +
					"The number of 50 dollar bills to be given to " + fullName + " is " + number50s + " . \n" +
					"The number of 20 dollar bills to be given to " + fullName + " is " + number20s + " . \n" +
					"The number of 10 dollar bills to be given to " + fullName + " is " + number10s + " . \n" +
					"The number of 5 dollar bills to be given to " + fullName + " is " + number5s + " . \n" +
					"The number of 1 dollar bills to be given to " + fullName + " is " + number1s + " . \n" +
					"The number of quaters to be given to " + fullName + " is " + numberQuarters + " . \n" +
					"The number of nickles bills to be given to " + fullName + " is " + numberDimes + " . \n" +
					"The number of dimes to be given to " + fullName + " is " + numberNickles + " . \n" +
					"The number of pennies to be given to " + fullName + " is " + numberPennies + " . \n" +
					"\n" +
					"This purchase was chaged to debit card **** **** **** " + lastDebit + ".";

		JOptionPane.showMessageDialog( null, recipt );
		
		System.exit(0);
		
		} //end main
	} // end PointOfSale