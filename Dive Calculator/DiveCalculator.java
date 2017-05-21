import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class DiveCalculator extends JFrame implements ActionListener {
	
	private static final int FRAME_WIDTH  		= 640;
	private static final int FRAME_HEIGHT 		= 480;
	private static final int FRAME_X_ORIGIN 	= 0;
	private static final int FRAME_Y_ORIGIN 	= 0;
	
	DiveCalculator {
		Container calc;
		setTitle		( "Dive Calculator" );
		setSize		( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation	( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		
		}
		
	public void actionPerformed ( ActionEvent event ) {
		Object evt = event.getSource();
		
		}
		
	public static void main ( String[] args ) {
		DiveCalculator diveCalc = new DiveCalculator();
		diveCalc.show();
		}
	
	}