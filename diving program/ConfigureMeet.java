import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class ConfigureMeet extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH	 = 600;
	private static final int FRAME_HEIGHT   = 800;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 150;
	
	
	public ConfigureMeet() {
		Container configure;
		setTitle			( "Meet configuration" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		configure = getContentPane();
		configure.setLayout(null);
		configure.setBackground(Color.white);
		}
	
	public void actionPerformed ( ActionEvent event ) {
		
		}

	}