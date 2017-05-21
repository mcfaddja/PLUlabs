import javax.swing.*;
import java.math.*;
import java.text.*;

public class Intelligence {
	public static void main ( String [] arg ) {
	
		String yourName = JOptionPane.showInputDialog (null, "What is your name?");
		
		double intelligenceLevel = Math.random() * 75;
		
		String result = "Hello, " + yourName + " your IQ is " + intelligenceLevel + ".";
		JOptionPane.showMessageDialog ( null, result );
		
		System.exit(0);
		}
	}