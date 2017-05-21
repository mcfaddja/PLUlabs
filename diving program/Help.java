import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class Help extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH	 = 600;
	private static final int FRAME_HEIGHT   = 800;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 150;
	
	
	public Help() {
		Container helpMe;
		setTitle			( "Help Contents" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		helpMe = getContentPane();
		helpMe.setLayout(null);
		helpMe.setBackground(Color.white);
		}
	
	public void actionPerformed ( ActionEvent event ) {
		
		}

	}