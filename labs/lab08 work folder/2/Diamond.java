// Histogram Chart skeleton 
// Java 1.4
// 3/2004
// gjhjr

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Diamond extends Frame {
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
	int HEIGHT = 400;
	int WIDTH = 300;
	
// **************************************
// Instantiate a Histogram Frame
	public Diamond( int spaceX, int spaceY, int dNum, String write ) {
		super( "Diamond" ) ;
		setSize( WIDTH, HEIGHT );
		
		spacingX = spaceX;
		spacingY = spaceY;
		num = dNum;
		printed = write;
		
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
		String xSpacingStrin;
		xSpacingStrin = JOptionPane.showInputDialog ( null, "Please set the desired X spacing.");
		String ySpacingStrin;
		ySpacingStrin = JOptionPane.showInputDialog ( null, "Please set the desired Y spacing.");
		String whichCharacter;
		whichCharacter = JOptionPane.showInputDialog ( null, "Please input the character that you would like to use.");
		
		int diamondNumber;
		int diamond1;
		int t = 0;
		while (t == 0){
			String diamondNumberStrin;
         diamondNumberStrin = JOptionPane.showInputDialog ( null, "Please input the base number for the diamond.");
                        
         
			diamondNumber = Integer.parseInt(diamondNumberStrin);
		
			if ((diamondNumber % 2) == 1){
				t = 1;
								
         	diamond1 = diamondNumber;
				int xSpacing = Integer.parseInt(xSpacingStrin);
				int ySpacing = Integer.parseInt(ySpacingStrin);
		
		
				Diamond  theFrame ;
				theFrame = new Diamond( xSpacing, ySpacing, diamond1, whichCharacter ) ;
				}
			else t = 0;		
			}
		
	}

}// Histogram
