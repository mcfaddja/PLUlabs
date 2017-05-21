// Histogram Chart skeleton 
// Java 1.4
// 3/2004
// gjhjr

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Diamond extends Frame {
	int height;
	int width;
	int start = 1;
	int start1 = 1;
	int num;
	int spacingX;
	int spacingY;
	int x;
	int y;
	int times = 1;
	int mid = num / 2 + 1;
	String printed;
	
// **************************************
// Instantiate a Histogram Frame
	public Diamond( int cHeight, int cWidth, int spaceX, int spaceY, int dNum, String write ) {
		super( "Diamond" ) ;
		setSize( WIDTH, HEIGHT );
		
		cHeight = height;
		cWidth = width;
		spaceX = spacingX;
		spaceY = spacingY;
		dNum = num;
		write = printed;
		
		addWindowListener( new WindowAdapter() 
		{
			public void windowClosing( WindowEvent e ){
				System.exit(0) ;
			}
		} ) ;
		
		// YOU PUT THE JOptionPanes here
		
		setVisible( true ) ;
	}
   
// **************************************
// Draw the chart in the window
	public void paint( Graphics g ) {
		/*
		Declare your calculated variables here.
		Put your calcualtions and drawing statements here.
		*/

		while (start1 <= num){
			times = 1;
			while (start >= times) {
				x = start * spacingX + 10;
				y = (num / 2 + times) * spacingY + (HEIGHT / 2) - 40;
				g.drawString( printed , x , y);
				times++;
				}
			
			times = 1;
			
			while (start >= times) {
				x = start * spacingX + 10;
				y = (num / 2 - times) * spacingY + (HEIGHT / 2);
				g.drawString( printed , x, y);
				times++;
				}		
			times = 1;
			
			if (start != mid){
				times = 1;
				while (start >= times) {
					x = (num - start + 1) * spacingX + 10;
					y = (num / 2 + times) * spacingY + (HEIGHT / 2) - 40;
					g.drawString( printed , x , y);
					times++;
					}
			
				times = 1;
			
				while (start >= times) {
					x = (num - start + 1) * spacingX + 10;
					y = (num / 2 - times) * spacingY + (HEIGHT / 2);
					g.drawString( printed , x, y);
					times++;
					}		
				times = 1;
			
				}
			start = start + 1;
			start1 = start1 + 2;
			}
	}

// **************************************
// Instantiate a frame
	public static void main( String args[] )
	{
		String windowHeightString;
		windowHeightString = JOptionPane.showInputDialog ( null, "Please set the desired windows Height.");
		String windowWidthString;
		windowWidthString = JOptionPane.showInputDialog ( null, "Please set the desired window Width.");
		String xSpacingString;
		xSpacingString = JOptionPane.showInputDialog ( null, "Please set the desired X spacing.");
		String ySpacingString;
		ySpacingString = JOptionPane.showInputDialog ( null, "Please set the desired Y spacing.");
		String whichCharacter;
		String whichCharacter = JOptionPane.showInputDialog ( null, "Please input the character that you would like to use.");

		int diamondNumber;
		int t = 0;
		while (t = 0){
			diamondNumberString = JOptionPane.showInputDialong ( null, "Please input the base number for the diamond.");
		
			diamondNumber = Integer.parseInt(diamondNumberString);
		
			if (diamondNumber % 2 = 1){
				t = 0;
				}
			else t = 1;
			
			}
		int windowHeight = Integer.parseInt(windowHeightString);
		int windowWidth = Integer.parseInt(windowWidthString);
		int xSpacing = Integer.parseInt(xSpacingString);
		int ySpacing = Integer.parseInt(ySpacingString);
		
		
		Diamond  theFrame ;
		theFrame = new Diamond( windowHeight, windowWidth, xSpacing, ySpacing, diamondNumber, whichCharacter ) ;
	}

}// Histogram
