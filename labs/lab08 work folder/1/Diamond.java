// Histogram Chart skeleton 
// Java 1.4
// 3/2004
// gjhjr

import java.awt.*;
import java.awt.event.* ;

public class Diamond extends Frame {
	int HEIGHT = 300 ;
	int WIDTH = 400 ;
	int num = 7;
	int spacingX = 10;
	int spacingY = 10;
	int x;
	int y;
	
	
	String printed = "*";
	
// **************************************
// Instantiate a Histogram Frame
	public Diamond() {
		super( "Histogram" ) ;
		setSize( WIDTH, HEIGHT );
		
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
		int times = 1;
		int start = 1;
		int start1 = 1;
		int mid = num / 2 + 1;
		
		
		while (start1 <= num){
			
			while (start >= times) {
				x = start * spacingX + 10;
				y = (num / 2 + times) * spacingY + (HEIGHT / 4) - 20;
				g.drawString( "*" , x , y);
				times++;
				}
			
			times = 1;
			
			while (start >= times) {
				x = start * spacingX + 10;
				y = (num / 2 - times) * spacingY + (HEIGHT / 4);
				g.drawString( "*" , x, y);
				times++;
				}		
			times = 1;
			
			if (start != mid){
				times = 1;
				while (start >= times) {
					x = (num - start + 1) * spacingX + 10;
					y = (num / 2 + times) * spacingY + (HEIGHT / 4) - 20;
					g.drawString( "*" , x , y);
					times++;
					}
			
				times = 1;
			
				while (start >= times) {
					x = (num - start + 1) * spacingX + 10;
					y = (num / 2 - times) * spacingY + (HEIGHT / 4);
					g.drawString( "*" , x, y);
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
		Diamond  theFrame ;
		theFrame = new Diamond(  ) ;
	}

}// Histogram
