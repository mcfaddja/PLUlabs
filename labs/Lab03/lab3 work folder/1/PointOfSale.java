import javax.swing.* ;
import java.text.* ;
public class PointOfSale {
	public static void main ( String [] arg ) {
		
		String fullName;
		fullName = JOptionPane.showInputDialog ( null, "What is your name?" );
		
		String debitCard;
		debitCard = JOptionPane.showInputDialog ( null, "What is your debit card number?" );
		
		String purchasePrice;
		purchasePrice = JOptionPane.showInputDialog ( null, "Enter the price of the purchase in cents." );

		String amountPaid;
		amountPaid = JOptionPane.showInputDialog ( null, "Enter the amount paid in cents." ) ;
		
		
		int priceInCents; 
		priceInCents = Integer.parseInt(purchasePrice);
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
		int numberQuaters = change1s / 25;
		int changeQuaters = change1s % 25;
		int numberDimes = changeQuaters / 10;
		int changeDimes = changeQuaters % 10;
		int numberNickles = changeDimes / 5;
		int changeNickles = changeDimes % 5;
		int numberPennies = changeNickles;
		
		
		DecimalFormat formatter = new DecimalFormat("0.00");
		String recipt;
		recipt = "Here is your recipt \n" + 
					"\n" + 
					"This purchase was made by " + fullName + ". \n" + 
					"This purchase was chaged to debit card " + debitCard + ". \n" +
					"The Purchase Price was $" + formatter.format(priceInDollars) + ". \n" +
					"The amount paid was $" + formatter.format(paidInDollars) + ". \n" +
					"The amount of change due " + fullName + " is $" + changeInDollars + ". \n" +
					"The number of 100 dollar bills to be given to " + fullName + " is " + number100s + " .";
		

		JOptionPane.showMessageDialog( null, recipt );
		
		System.exit(0);
		
		} //end main
	} // end PointOfSale