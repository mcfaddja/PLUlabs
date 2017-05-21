import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class RunMeet extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH	 = 600;
	private static final int FRAME_HEIGHT   = 800;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 150;
	
	
	public RunMeet() {
		Container run;
		setTitle			( "Run the Meet" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		run = getContentPane();
		run.setLayout(null);
		run.setBackground(Color.white);
		}
	
	public void actionPerformed ( ActionEvent event ) {
		
		}

	}