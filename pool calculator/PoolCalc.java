import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class PoolCalc extends JFrame implements ActionListener {
	
	private static final int FRAME_WIDTH		=	800;
	private static final int FRAME_HEIGHT		=	800;
	private static final int FRAME_X_ORIGIN	=	100;
	private static final int FRAME_Y_ORIGIN	=	100;
	
	
	private JLabel volume;
	private JTextField poolVolume;
	private JLabel testResults;
	private JLabel pH;
	private JTextField poolPH;
	private JLabel fC;
	private JTextField poolFC;
	private JLabel tC;
	private JTextField poolTC;	
	private JLabel cal;
	private JTextField poolCal;
	private JLabel alk;
	private JTextField poolAlk;
	private JLabel temp;
	private JTextField poolTemp;
	private JLabel cYA;
	private JTextField poolCYA;

	
	
	public PoolCalc() {
		Container calc;
		setTitle			("Jonathan's pool Calculator");
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		calc = getContentPane();
		calc.setLayout(null);
		
		volume = new JLabel();
		volume.setText("Pool Volume:  ");
		volume.setBounds(20,20,80,20);
		calc.add(volume);
		
		poolVolume = new JTextField();
		poolVolume.setBounds(100,20,200,20);
		calc.add(poolVolume);
		
		testResults = new JLabel();
		testResults.setText("Your Last Test Results");
		testResults.setBounds(20,60,200,20);
		calc.add(testResults);
		
		pH = new JLabel();
		pH.setText("pH:  ");
		pH.setBounds(20,80,40,20);
		calc.add(pH);
		
		poolPH = new JTextField();
		poolPH.setBounds(60,80,40,20);
		calc.add(poolPH);
		
		fC = new JLabel();
		fC.setText("Free Chlorine:  ");
		fC.setBounds(110,80,130,20);
		calc.add(fC);
		
		poolFC = new JTextField();
		poolFC.setBounds(250,80,40,20);
		calc.add(poolFC);
		
		tC = new JLabel();
		tC.setText("Total Chlorine:  ");
		tC.setBounds(300,80,140,20);
		calc.add(tC);
		
		poolTC = new JTextField();
		poolTC.setBounds(450,80,40,20);
		calc.add(poolTC);
		
		cal = new JLabel();
		cal.setText("Calcium Hardness:  ");
		cal.setBounds(20,120,70,20);
		calc.add(cal);
		
		poolCal = new JTextField();
		poolCal.setBounds(100,120,40,20);
		calc.add(poolCal);
		
		alk = new JLabel();
		alk.setText("Total Alkalinity: ");
		alk.setBounds(150,120,90,20);
		calc.add(alk);
		
		poolAlk = new JTextField();
		poolAlk.setBounds(250,120,40,20);
		calc.add(poolAlk);
		
		cYA = new JLabel();
		cYA.setText("Cynuric Acid:  ");
		cYA.setBounds(20,160,70,20);
		calc.add(cYA);
		
		poolCYA = new JTextField();
		poolCYA.setBounds(100,160,40,20);
		calc.add(poolCYA);
		
		temp = new JLabel();
		temp.setText("Pool Temperature:  ");
		temp.setBounds(150,160,90,20);
		calc.add(temp);
		
		poolTemp = new JTextField();
		poolTemp.setBounds(250,160,40,20);
		calc.add(poolTemp);
		
		
		
		}
	
	public void actionPerformed ( ActionEvent event ) {
		
		}
	
	public static void main ( String[] args ) {
		PoolCalc poolCalculator = new PoolCalc();
		poolCalculator.show();
		}
	}