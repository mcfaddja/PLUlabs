 // Histogram Chart skeleton 
// Java 1.4
// 3/2004
// gjhjr

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Histogram extends Frame {
	final int HEIGHT = 300 ;
	final int WIDTH = 400 ;
	final int BAR_WIDTH = 40;
	final int HORIZONTAL_SCALE = 40;
	final int X_ORIGIN = WIDTH / 4;
	final int Y_ORIGIN = 3 * HEIGHT / 4 + 25;
	final int AXIS_LENGTH = WIDTH /2;
	
	int numA;
	int numB;
	int numC;
	int numD;
	int numE;
	
	int scale = 10;
	//int scale = * Math.max( numA, Math.max( numB, Math.max( numC, Math.max( numD, numE ))));
	
	
// **************************************
// Instantiate a Histogram Frame
	public Histogram() {
		super( "Histogram" ) ;
		setSize( WIDTH, HEIGHT );
		
		addWindowListener( new WindowAdapter() 
		{
			public void windowClosing( WindowEvent e ){
				System.exit(0) ;
			}
		} ) ;
		
		// YOU PUT THE JOptionPanes here
		numA = 1;
		numB = 7;
		numC = 15;
		numD = 3;
		numE = 2;
				
		setVisible( true ) ;
	}
   
// **************************************
// Draw the chart in the window
	public void paint( Graphics g ) {
		/*
		Declare your calculated variables here.
		Put your calcualtions and drawing statements here.
		*/
		g.drawLine( X_ORIGIN, Y_ORIGIN, X_ORIGIN + AXIS_LENGTH, Y_ORIGIN ) ;
		g.drawLine( X_ORIGIN, Y_ORIGIN, X_ORIGIN, Y_ORIGIN - AXIS_LENGTH ) ;
		g.drawRect( X_ORIGIN, Y_ORIGIN - numA * scale, BAR_WIDTH, numA * scale);
		g.drawRect( X_ORIGIN + BAR_WIDTH, Y_ORIGIN - numB * scale, BAR_WIDTH, numB * scale);
		g.drawRect( X_ORIGIN + BAR_WIDTH * 2, Y_ORIGIN - numC * scale, BAR_WIDTH, numC * scale);
		g.drawRect( X_ORIGIN + BAR_WIDTH * 3, Y_ORIGIN - numD * scale, BAR_WIDTH, numD * scale);
		g.drawRect( X_ORIGIN + BAR_WIDTH * 4, Y_ORIGIN - numE * scale, BAR_WIDTH, numE * scale);
		g.drawString( "A", X_ORIGIN + BAR_WIDTH / 2, Y_ORIGIN + 15);
		g.drawString( "B", X_ORIGIN + 3 * BAR_WIDTH / 2, Y_ORIGIN + 15);
		g.drawString( "C", X_ORIGIN + 5 * BAR_WIDTH / 2, Y_ORIGIN + 15);
		g.drawString( "D", X_ORIGIN + 7 * BAR_WIDTH / 2, Y_ORIGIN + 15);
		g.drawString( "E", X_ORIGIN + 9 * BAR_WIDTH / 2, Y_ORIGIN + 15);
		g.drawString( "0", X_ORIGIN - 25, Y_ORIGIN);
		g.drawString( "5", X_ORIGIN - 25, Y_ORIGIN - AXIS_LENGTH / 4);
		g.drawString( "10", X_ORIGIN - 25, Y_ORIGIN - AXIS_LENGTH / 2);
		g.drawString( "15", X_ORIGIN - 25, Y_ORIGIN - 3 * AXIS_LENGTH / 4);
		g.drawString( "20", X_ORIGIN - 25, Y_ORIGIN - AXIS_LENGTH);
		g.drawString( "Quiz Scores", X_ORIGIN + AXIS_LENGTH / 2 - 25, Y_ORIGIN - ( AXIS_LENGTH + 10));
		g.drawString( "Good Job!", X_ORIGIN + AXIS_LENGTH / 2 - 25, Y_ORIGIN + 35);
	}

// **************************************
// Instantiate a frame
	public static void main( String args[] )
	{
		String statement;
		statement = "Please enter the grades for the quiz (AAABBBCCCDDDEEE).";
		String grades;
		grades = JOptionPane.showInputDialog( null, statement );
		
		Histogram  theFrame ;
		theFrame = new Histogram(  ) ;
	}

}// Histogram
