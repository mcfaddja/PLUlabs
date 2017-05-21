// Clock skeleton 
// Java 1.4
// 3/2004
// gjhjr

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Clock extends Frame {
	
	//declare constants
	final int HEIGHT = 300 ;
	final int WIDTH = 400 ;
	final int RADIUS = 100;
	final double LENGTH_HOUR = (RADIUS * 2) / 2.0 * (2.0/3.0);
	final double LENGTH_MINUTE = (RADIUS * 2) / 2.0 * (4.0/5.0);
	final int X_ORIGIN = WIDTH / 2;
	final int Y_ORIGIN = HEIGHT / 2;
	final double BASE_ANGLE = 30.0;
	
	//declare variables
	int hourPositionX;
	int hourPositionY;
	int minutePositionX;
	int minutePositionY;
	double minuteAngle;
	double hourAngle;

	//time data, currently constants will eventually be changed to variables
	double hour;
	double minute;
	
	
// **************************************
// Instantiate a Clock Frame
	public Clock( double timeHour, double timeMinute ) {
		super( "Clock" ) ;
		setSize( WIDTH, HEIGHT );
		
		hour = timeHour;
		minute = timeMinute;
		
		addWindowListener( new WindowAdapter() 
		{
			public void windowClosing( WindowEvent e ){
				System.exit(0) ;
			}
		} ) ;
		
		setVisible( true ) ;
	}
   
// **************************************
// Draw the clock in the center of the window
	public void paint( Graphics g ) {

		double hourAngle =  ( (hour + minute / 60.0 ) * BASE_ANGLE ) - 90.0;
		double minuteAngle = (minute * 6.0) - 90.0;
		
		int hourPositionX =  (int) (X_ORIGIN + LENGTH_HOUR * Math.cos(Math.toRadians(hourAngle)));
		int hourPositionY =  (int) (Y_ORIGIN + LENGTH_HOUR * Math.sin(Math.toRadians(hourAngle)));
		int minutePositionX =  (int) (X_ORIGIN + LENGTH_MINUTE * Math.cos(Math.toRadians(minuteAngle)));
		int minutePositionY =  (int) (Y_ORIGIN + LENGTH_MINUTE * Math.sin(Math.toRadians(minuteAngle)));
		int position1X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 1) - 90 )));
		int position1Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 1) - 90 )));
		int position2X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 2) - 90 )));
		int position2Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 2) - 90 )));
		int position3X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 3) - 90 )));
		int position3Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 3) - 90 )));
		int position4X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 4) - 90 )));
		int position4Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 4) - 90 )));
		int position5X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 5) - 90 )));
		int position5Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 5) - 90 )));
		int position6X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 6) - 90 )));
		int position6Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 6) - 90 )));
		int position7X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 7) - 90 )));
		int position7Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 7) - 90 )));
		int position8X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 8) - 90 )));
		int position8Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 8) - 90 )));
		int position9X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 9) - 90 )));
		int position9Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 9) - 90 )));
		int position10X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 10) - 90 )));
		int position10Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 10) - 90 )));
		int position11X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 11) - 90 )));
		int position11Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 11) - 90 )));
		int position12X = (int) (X_ORIGIN + RADIUS * Math.cos(Math.toRadians((BASE_ANGLE * 12) - 90 )));
		int position12Y = (int) (Y_ORIGIN + RADIUS * Math.sin(Math.toRadians((BASE_ANGLE * 12) - 90 )));

		/*
		Declare your calculated variables here.
		Put your calcualtions and drawing statements here.
		*/
		g.drawOval( X_ORIGIN - (RADIUS * 2) / 2, Y_ORIGIN - (RADIUS * 2) / 2, (RADIUS * 2), (RADIUS * 2));
		g.drawLine( X_ORIGIN, Y_ORIGIN, hourPositionX, hourPositionY );
		g.drawLine( X_ORIGIN, Y_ORIGIN, minutePositionX, minutePositionY );
		
		g.fillOval( X_ORIGIN - 2, Y_ORIGIN - 2, 4, 4 ) ;
		g.drawString( (int) hour + ":" + (int) minute , WIDTH/2 + 5, HEIGHT/2 - 5) ;
		g.drawString( "1" , position1X, position1Y);
		g.drawString( "2" , position2X, position2Y);
		g.drawString( "3" , position3X, position3Y);
		g.drawString( "4" , position4X, position4Y);
		g.drawString( "5" , position5X, position5Y);
		g.drawString( "6" , position6X, position6Y);
		g.drawString( "7" , position7X, position7Y);
		g.drawString( "8" , position8X, position8Y);
		g.drawString( "9" , position9X, position9Y);
		g.drawString( "10" , position10X, position10Y);
		g.drawString( "11" , position11X, position11Y);
		g.drawString( "12" , position12X, position12Y);
	}

// **************************************
// Instantiate a frame
	public static void main( String args[] )
	{
		String theTimeIs;
		theTimeIs = JOptionPane.showInputDialog ( null , "Please input the time in the format HH:MM." );
		String hourTime = theTimeIs.substring(0 , (theTimeIs.indexOf(":")) );
		String minuteTime = theTimeIs.substring((theTimeIs.indexOf(":") + 1), theTimeIs.length() );
		
		Clock  theFrame ;
		theFrame = new Clock( Double.parseDouble(hourTime), Double.parseDouble(minuteTime) ) ;
		

		
	}

}// Clock
