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
import java.text.*;
public class PointOfSale {
	public static void main ( String [] arg ) {
		
		String fullName;
		fullName = JOptionPane.showInputDialog(null, "What is your name?");
		
		String debitCardNumber;
		debitCardNumber = JOptionPane.showInputDialog(null, "What is your debit card number?");
		
		String purchasePriceInCents;
		purchasePrice = JOptionPane.showInputDialog(null, "What is the purchase price, in cents?");
		
		String amountPaid;
		amountPaid = JOptionPane.showInputDialog(null, "What is the amount to be paid, in cents?");
		
		
				
		int purchase = pruchasePrice;
		int paid = amountPaid;
		
		int amountOfChange = paid - purchase;
		double change = amountOfChange;
		
		
		
		int pruchasePriceCents = purchasePrice;
		int purchasePriceDollars	= pruchasePrice / 100.00;
		int amountPaidCents = amountPaid;
		int amountPaidDollars = amountPaid / 100.00;
		int amountOfChangeCents = amountOfChange;
		int amountOfChangeDollars = amountOfChange / 100.00;
		
		
		
		number100000s = change / 100000;
		change100000s = change % 100000;
		number10000s = change100000s / 10000;
		change10000s = change100000s % 10000;
		number1000s = change10000s / 1000;
		change1000s = change10000s % 1000;
		number100s = change1000s / 100;
		change100s = change1000s % 100;
		number50s = change100s / 50;
		change50s = change100s % 50;
		number20s = change50s / 20;
		change20s = change50s % 20;
		number10s = change20s / 10;
		change10s = change20s % 10;
		number5s = change10s / 5;
		change5s = change10s % 5;
		number1s = change5s / 1;
		change1s = change5s / 1;
		numberQuarters = change1s / 0.25;
		changeQuarters = change1s % 0.25;
		numberDimes = changeQuarters / 0.10;
		changeDimes = changeQuarters % 0.10;
		numberNickles = changeDimes / 0.5;
		changeNickles = changeDimes % 0.5;
		numberPennies = changeNickles;
		
		
		String recipt
		recipt = ("Purchase made by" + fullName + "\n" + "The price of the purchase, in cents, made by" + fullName + "is" + purchasePriceCents + "\n" + "The price of the purchase, in dollars, made by" + fullName + "is" + purchasePriceDollars + "\n" + "The amount paid, in cents, by" + fullName + "is" + amountPaidCents + "\n"	+ "The amount paid, in dollars, by" + fullName + "is" + ammountPaidDollars + "\n" + "The amount of change, in cents, due" + fullName + "is" + ammountOfChangeCents + "\n" + "The amount of change, in dollars, due" + fullName + "is" + ammountOfChangeDollars + "\n" + "The number of 100,000 Dollar Bills given to" + fullName + "is" + numbers100000s + "\n" + "The number of 10,000 Dollar Bills given to" + fullName + "is" + numbers10000s + "\n" + "The number of 1,000 Dollar Bills given to" + fullName + "is" + numbers1000s + "\n" + "The number of 100 Dollar Bills given to" + fullName + "is" + numbers100s + "\n" + "The number of 50 Dollar Bills given to" + fullName + "is" + numbers50s + "\n" + "The number of 20 Dollar Bills given to" + fullName + "is" + numbers20s + "\n" + "The number of 10 Dollar Bills given to" + fullName + "is" + numbers10s + "\n" + "The number of 5 Dollar Bills given to" + fullName + "is" + numbers5 + "\n" "The number of 1 Dollar Bills given to" + fullName + "is" + numbers1s + "\n" + "The number of Quarters given to" + fullName + "is" + numberQuarters + "\n" + "The number of Dimes given to" + fullName + "is" + numberDimes + "\n" + "The number of Nickles given to" + fullName + "is" + numberNickles + "\n" + "The number of pennies given to" + fullName + "is" + numberPennies + "\n");
		
		JOptionPane.showMessageDialog( null, recipt ) ;
		
		System.exit(0);
		
		} // endmain
	}// end PointOfSale
	