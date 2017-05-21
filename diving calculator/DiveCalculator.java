import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class DiveCalculator extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH 		= 1024;
	private static final int FRAME_HEIGHT		= 768;
	private static final int FRAME_X_ORIGIN	= 150;
	private static final int FRAME_Y_ORIGIN	= 150;
	
	private JMenuBar calcMenuBar;
	private JMenu fileMenu;
	private JMenuItem meetSetupMenuItem;
	private JMenuItem resetMenuItem;
	private JMenuItem quitMenuItem;
	private JMenu meetMenu;
	private JMenuItem nextRoundMenuItem;
	private JMenuItem previousRoundMenuItem;
	private JMenuItem selectRoundMenuItem;
	private JMenuItem newDiverMenuItem;
	private JMenuItem selectDiverMenuItem;
	private JMenuItem nextDiverMenuItem;
	private JMenuItem previousDiverMenuItem;
	private JMenu viewMenu;
	private JMenuItem viewTeamsMenuItem;
	private JMenuItem viewDiversMenuItem;
	private JMenuItem viewDDTableMenuItem;
	private JMenu editMenu;
	private JMenuItem editTeamsMenuItem;
	private JMenuItem editDiversMenuItem;
	private JMenuItem editDDTableMenuItem;	
	
	private JButton previousRoundButton;
	private JButton selectRoundButton;
	private JButton nextRoundButton;
	private JLabel currentRoundLabel;
	private JTextField currentRoundTextField;
	
	private JButton previousDiverButton;
	private JButton addDiverButton;
	private JButton selectDiverButton;
	private JButton nextDiverButton;

	private JLabel currentDiverNameLabel;
	private JTextField currentDiverNameTextField;
	private JLabel currentDiverIDLabel;
	private JTextField currentDiverIDTextField;
	private JLabel currentDiverOrderLabel;
	private JTextField currentDiverOrderTextField;
	private JLabel currentDiverTeamLabel;
	private JTextField currentDiverTeamTextField;
	private JLabel currentDiverScoreLabel;
	private JTextField currentDiverScoreTextField;
	private JLabel currentDiverRankLabel;
	private JTextField currentDiverRankTextField;
	private JLabel currentDiverPointsToOvertakeLabel;
	private JTextField currentDiverPointsToOvertakeTextField;
	
	private JLabel currentDiveNumberLabel;
	private JTextField currentDiveNumberTextField;
	private JLabel currentDiveNameLabel;
	private JTextField currentDiveNameTextField;
	private JLabel currentDiveDDLabel;
	private JTextField currentDiveDDTextField;
	
	private JCheckBox	judge1;
	private JButton judge1score000;
	private JButton judge1score005;
	private JButton judge1score010;
	private JButton judge1score015;
	private JButton judge1score020;
	private JButton judge1score025;
	private JButton judge1score030;
	private JButton judge1score035;
	private JButton judge1score040;
	private JButton judge1score045;
	private JButton judge1score050;
	private JButton judge1score055;
	private JButton judge1score060;
	private JButton judge1score065;
	private JButton judge1score070;
	private JButton judge1score075;
	private JButton judge1score080;
	private JButton judge1score085;
	private JButton judge1score090;
	private JButton judge1score095;
	private JButton judge1score100;
	private JButton judge1scoreReset;
	private JTextField judge1score;
	
	private JCheckBox	judge2;
	private JButton judge2score000;
	private JButton judge2score005;
	private JButton judge2score010;
	private JButton judge2score015;
	private JButton judge2score020;
	private JButton judge2score025;
	private JButton judge2score030;
	private JButton judge2score035;
	private JButton judge2score040;
	private JButton judge2score045;
	private JButton judge2score050;
	private JButton judge2score055;
	private JButton judge2score060;
	private JButton judge2score065;
	private JButton judge2score070;
	private JButton judge2score075;
	private JButton judge2score080;
	private JButton judge2score085;
	private JButton judge2score090;
	private JButton judge2score095;
	private JButton judge2score100;
	private JButton judge2scoreReset;
	private JTextField judge2score;
	
	private JCheckBox	judge3;
	private JButton judge3score000;
	private JButton judge3score005;
	private JButton judge3score010;
	private JButton judge3score015;
	private JButton judge3score020;
	private JButton judge3score025;
	private JButton judge3score030;
	private JButton judge3score035;
	private JButton judge3score040;
	private JButton judge3score045;
	private JButton judge3score050;
	private JButton judge3score055;
	private JButton judge3score060;
	private JButton judge3score065;
	private JButton judge3score070;
	private JButton judge3score075;
	private JButton judge3score080;
	private JButton judge3score085;
	private JButton judge3score090;
	private JButton judge3score095;
	private JButton judge3score100;
	private JButton judge3scoreReset;
	private JTextField judge3score;
	
	private JCheckBox	judge4;
	private JButton judge4score000;
	private JButton judge4score005;
	private JButton judge4score010;
	private JButton judge4score015;
	private JButton judge4score020;
	private JButton judge4score025;
	private JButton judge4score030;
	private JButton judge4score035;
	private JButton judge4score040;
	private JButton judge4score045;
	private JButton judge4score050;
	private JButton judge4score055;
	private JButton judge4score060;
	private JButton judge4score065;
	private JButton judge4score070;
	private JButton judge4score075;
	private JButton judge4score080;
	private JButton judge4score085;
	private JButton judge4score090;
	private JButton judge4score095;
	private JButton judge4score100;
	private JButton judge4scoreReset;
	private JTextField judge4score;
	
	private JCheckBox	judge5;
	private JButton judge5score000;
	private JButton judge5score005;
	private JButton judge5score010;
	private JButton judge5score015;
	private JButton judge5score020;
	private JButton judge5score025;
	private JButton judge5score030;
	private JButton judge5score035;
	private JButton judge5score040;
	private JButton judge5score045;
	private JButton judge5score050;
	private JButton judge5score055;
	private JButton judge5score060;
	private JButton judge5score065;
	private JButton judge5score070;
	private JButton judge5score075;
	private JButton judge5score080;
	private JButton judge5score085;
	private JButton judge5score090;
	private JButton judge5score095;
	private JButton judge5score100;
	private JButton judge5scoreReset;
	private JTextField judge5score;
	
	private JCheckBox	judge6;
	private JButton judge6score000;
	private JButton judge6score005;
	private JButton judge6score010;
	private JButton judge6score015;
	private JButton judge6score020;
	private JButton judge6score025;
	private JButton judge6score030;
	private JButton judge6score035;
	private JButton judge6score040;
	private JButton judge6score045;
	private JButton judge6score050;
	private JButton judge6score055;
	private JButton judge6score060;
	private JButton judge6score065;
	private JButton judge6score070;
	private JButton judge6score075;
	private JButton judge6score080;
	private JButton judge6score085;
	private JButton judge6score090;
	private JButton judge6score095;
	private JButton judge6score100;
	private JButton judge6scoreReset;
	private JTextField judge6score;
	
	private JCheckBox	judge7;
	private JButton judge7score000;
	private JButton judge7score005;
	private JButton judge7score010;
	private JButton judge7score015;
	private JButton judge7score020;
	private JButton judge7score025;
	private JButton judge7score030;
	private JButton judge7score035;
	private JButton judge7score040;
	private JButton judge7score045;
	private JButton judge7score050;
	private JButton judge7score055;
	private JButton judge7score060;
	private JButton judge7score065;
	private JButton judge7score070;
	private JButton judge7score075;
	private JButton judge7score080;
	private JButton judge7score085;
	private JButton judge7score090;
	private JButton judge7score095;
	private JButton judge7score100;
	private JButton judge7scoreReset;
	private JTextField judge7score;
	
	
	
	DiveCalculator() {
		Container calc;
		setTitle			( "Diving Score Calculator" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		calc = getContentPane();
		calc.setLayout(null);
		calc.setBackground(Color.white);
		
		
		fileMenu = new JMenu("File");
		
		meetSetupMenuItem = new JMenuItem("Setup the Meet");
		meetSetupMenuItem.addActionListener(this);
		fileMenu.add(meetSetupMenuItem);
		
		resetMenuItem = new JMenuItem("Reset the Meet");
		resetMenuItem.addActionListener(this);
		fileMenu.add(resetMenuItem);
		
		fileMenu.addSeparator();
		
		quitMenuItem = new JMenuItem("Quit");
		quitMenuItem.addActionListener(this);
		fileMenu.add(quitMenuItem);
		
		
		meetMenu = new JMenu("Meet");
		
		nextRoundMenuItem = new JMenuItem("Go to the next round");
		nextRoundMenuItem.addActionListener(this);
		meetMenu.add(nextRoundMenuItem);
		
		previousRoundMenuItem = new JMenuItem("Go to the previous round");
		previousRoundMenuItem.addActionListener(this);
		meetMenu.add(previousRoundMenuItem);
		
		selectRoundMenuItem = new JMenuItem("Select a round");
		selectRoundMenuItem.addActionListener(this);
		meetMenu.add(selectRoundMenuItem);
		
		meetMenu.addSeparator();
		
		newDiverMenuItem = new JMenuItem("Create a new diver");
		newDiverMenuItem.addActionListener(this);
		meetMenu.add(newDiverMenuItem);
		
		selectDiverMenuItem = new JMenuItem("Select a diver from list");
		selectDiverMenuItem.addActionListener(this);
		meetMenu.add(selectDiverMenuItem);
		
		meetMenu.addSeparator();
		
		nextDiverMenuItem = new JMenuItem("Go to the next diver");
		nextDiverMenuItem.addActionListener(this);
		meetMenu.add(nextDiverMenuItem);
		
		previousDiverMenuItem = new JMenuItem("Go to the previous diver");
		previousDiverMenuItem.addActionListener(this);
		meetMenu.add(previousDiverMenuItem);
		
		
		viewMenu = new JMenu("View");
		
		viewTeamsMenuItem = new JMenuItem("View all teams");
		viewTeamsMenuItem.addActionListener(this);
		viewMenu.add(viewTeamsMenuItem);
		
		viewDiversMenuItem = new JMenuItem("View all divers");
		viewDiversMenuItem.addActionListener(this);
		viewMenu.add(viewDiversMenuItem);
		
		viewMenu.addSeparator();
		
		viewDDTableMenuItem = new JMenuItem("View DD table");
		viewDDTableMenuItem.addActionListener(this);
		viewMenu.add(viewDDTableMenuItem);
		
		
		editMenu = new JMenu("Edit");
		
		editTeamsMenuItem = new JMenuItem("Add/Edit Teams");
		editTeamsMenuItem.addActionListener(this);
		editMenu.add(editTeamsMenuItem);
		
		editDiversMenuItem = new JMenuItem("Add/Edit Divers");
		editDiversMenuItem.addActionListener(this);
		editMenu.add(editDiversMenuItem);
		
		editMenu.addSeparator();
		
		editDDTableMenuItem = new JMenuItem("Edit the DD of a dive");
		editDDTableMenuItem.addActionListener(this);
		editMenu.add(editDDTableMenuItem);
		
		
		calcMenuBar = new JMenuBar();
		setJMenuBar(calcMenuBar);
		calcMenuBar.add(fileMenu);
		calcMenuBar.add(meetMenu);
		calcMenuBar.add(viewMenu);
		calcMenuBar.add(editMenu);
		
		
		previousRoundButton = new JButton("Go to the previous round");
		previousRoundButton.setBounds(7,10,190,30);
		previousRoundButton.addActionListener(this);
		calc.add(previousRoundButton);
		
		selectRoundButton = new JButton("Select a round");
		selectRoundButton.setBounds(203,10,190,30);
		selectRoundButton.addActionListener(this);
		calc.add(selectRoundButton);
		
		nextRoundButton = new JButton("Go to the next round");
		nextRoundButton.setBounds(399,10,190,30);
		nextRoundButton.addActionListener(this);
		calc.add(nextRoundButton);
		
		currentRoundLabel = new JLabel("Current Round:");
		currentRoundLabel.setBounds(638,10,95,30);
		calc.add(currentRoundLabel);
		
		currentRoundTextField = new JTextField();
		currentRoundTextField.setBounds(735,10,50,30);
		currentRoundTextField.setEditable(false);
		calc.add(currentRoundTextField);
		
					
		previousDiverButton = new JButton("Go to the previous diver");
		previousDiverButton.setBounds(7,45,190,30);
		previousDiverButton.addActionListener(this);
		calc.add(previousDiverButton);
		
		addDiverButton = new JButton("Create a new diver");
		addDiverButton.setBounds(203,45,190,30);
		addDiverButton.addActionListener(this);
		calc.add(addDiverButton);
		
		selectDiverButton = new JButton("Select a diver from a list");
		selectDiverButton.setBounds(399,45,190,30);
		selectDiverButton.addActionListener(this);
		calc.add(selectDiverButton);
		
		nextDiverButton = new JButton("Go to the next diver");
		nextDiverButton.setBounds(595,45,190,30);
		nextDiverButton.addActionListener(this);
		calc.add(nextDiverButton);
		
		
		currentDiverNameLabel = new JLabel("Current Diver:");
		currentDiverNameLabel.setBounds(7,90,100,30);
		calc.add(currentDiverNameLabel);
		
		currentDiverNameTextField = new JTextField();
		currentDiverNameTextField.setBounds(117,90,276,30);
		currentDiverNameTextField.setEditable(false);
		calc.add(currentDiverNameTextField);
		
		currentDiverIDLabel = new JLabel("Diver ID Number:");
		currentDiverIDLabel.setBounds(434,90,95,30);
		calc.add(currentDiverIDLabel);
		
		currentDiverIDTextField = new JTextField();
		currentDiverIDTextField.setBounds(539,90,50,30);
		currentDiverIDTextField.setEditable(false);
		calc.add(currentDiverIDTextField);
		
		currentDiverOrderLabel = new JLabel("Order Number:");
		currentDiverOrderLabel.setBounds(640,90,85,30);
		calc.add(currentDiverOrderLabel);
		
		currentDiverOrderTextField = new JTextField();
		currentDiverOrderTextField.setBounds(735,90,50,30);
		currentDiverOrderTextField.setEditable(false);
		calc.add(currentDiverOrderTextField);
		
		currentDiverTeamLabel = new JLabel("Team:");
		currentDiverTeamLabel.setBounds(7,125,40,30);
		calc.add(currentDiverTeamLabel);
		
		currentDiverTeamTextField = new JTextField();
		currentDiverTeamTextField.setBounds(57,125,105,30);
		currentDiverTeamTextField.setEditable(false);
		calc.add(currentDiverTeamTextField);
				
		currentDiverPointsToOvertakeLabel = new JLabel("Points to Overtake Leader:");
		currentDiverPointsToOvertakeLabel.setBounds(178,125,155,30);
		calc.add(currentDiverPointsToOvertakeLabel);
		
		currentDiverPointsToOvertakeTextField = new JTextField();
		currentDiverPointsToOvertakeTextField.setBounds(343,125,50,30);
		currentDiverPointsToOvertakeTextField.setEditable(false);
		calc.add(currentDiverPointsToOvertakeTextField);
		
		currentDiverRankLabel = new JLabel("Rank:");
		currentDiverRankLabel.setBounds(494,125,35,30);
		calc.add(currentDiverRankLabel);
		
		currentDiverRankTextField = new JTextField();
		currentDiverRankTextField.setBounds(539,125,50,30);
		currentDiverRankTextField.setEditable(false);
		calc.add(currentDiverRankTextField);
		
		currentDiverScoreLabel = new JLabel("Current Point Total:");
		currentDiverScoreLabel.setBounds(615,125,110,30);
		calc.add(currentDiverScoreLabel);
		
		currentDiverScoreTextField = new JTextField();
		currentDiverScoreTextField.setBounds(735,125,50,30);
		currentDiverScoreTextField.setEditable(false);
		calc.add(currentDiverScoreTextField);
				
		
		currentDiveNumberLabel = new JLabel("Dive Number:");
		currentDiveNumberLabel.setBounds(17,170,80,30);
		calc.add(currentDiveNumberLabel);
		
		currentDiveNumberTextField = new JTextField();
		currentDiveNumberTextField.setBounds(107,170,90,30);
		currentDiveNumberTextField.setEditable(false);
		calc.add(currentDiveNumberTextField);
		
		currentDiveNameLabel = new JLabel("Dive Name:");
		currentDiveNameLabel.setBounds(223,170,70,30);
		calc.add(currentDiveNameLabel);
		
		currentDiveNameTextField = new JTextField();
		currentDiveNameTextField.setBounds(303,170,286,30);
		currentDiveNameTextField.setEditable(false);
		calc.add(currentDiveNameTextField);
		
		currentDiveDDLabel = new JLabel("DD:");
		currentDiveDDLabel.setBounds(665,170,20,30);
		calc.add(currentDiveDDLabel);
		
		currentDiveDDTextField = new JTextField();
		currentDiveDDTextField.setBounds(695,170,90,30);
		currentDiveDDTextField.setEditable(false);
		calc.add(currentDiveDDTextField);
		
		
		judge1 = new JCheckBox("Judge #1");
		judge1.setBounds(7,235,97,30);
		judge1.setBackground(Color.white);
		judge1.addActionListener(this);
		calc.add(judge1);
		
		judge1score000 = new JButton("0");
		judge1score000.setBounds(114,220,61,30);
		judge1score000.addActionListener(this);
		calc.add(judge1score000);
		
		judge1score005 = new JButton("0.5");
		judge1score005.setBounds(114,250,61,30);
		judge1score005.addActionListener(this);
		calc.add(judge1score005);
		
		judge1score010 = new JButton("1");
		judge1score010.setBounds(175,220,61,30);
		judge1score010.addActionListener(this);
		calc.add(judge1score010);
		
		judge1score015 = new JButton("1.5");
		judge1score015.setBounds(175,250,61,30);
		judge1score015.addActionListener(this);
		calc.add(judge1score015);
		
		judge1score020 = new JButton("2");
		judge1score020.setBounds(236,220,61,30);
		judge1score020.addActionListener(this);
		calc.add(judge1score020);
		
		judge1score025 = new JButton("2.5");
		judge1score025.setBounds(236,250,61,30);
		judge1score025.addActionListener(this);
		calc.add(judge1score025);
		
		judge1score030 = new JButton("3");
		judge1score030.setBounds(297,220,61,30);
		judge1score030.addActionListener(this);
		calc.add(judge1score030);
		
		judge1score035 = new JButton("3.5");
		judge1score035.setBounds(297,250,61,30);
		judge1score035.addActionListener(this);
		calc.add(judge1score035);
		
		judge1score040 = new JButton("4");
		judge1score040.setBounds(358,220,61,30);
		judge1score040.addActionListener(this);
		calc.add(judge1score040);
		
		judge1score045 = new JButton("4.5");
		judge1score045.setBounds(358,250,61,30);
		judge1score045.addActionListener(this);
		calc.add(judge1score045);
		
		judge1score050 = new JButton("5");
		judge1score050.setBounds(419,220,61,30);
		judge1score050.addActionListener(this);
		calc.add(judge1score050);
		
		judge1score055 = new JButton("5.5");
		judge1score055.setBounds(419,250,61,30);
		judge1score055.addActionListener(this);
		calc.add(judge1score055);
		
		judge1score060 = new JButton("6");
		judge1score060.setBounds(480,220,61,30);
		judge1score060.addActionListener(this);
		calc.add(judge1score060);
		
		judge1score065 = new JButton("6.5");
		judge1score065.setBounds(480,250,61,30);
		judge1score065.addActionListener(this);
		calc.add(judge1score065);
		
		judge1score070 = new JButton("7");
		judge1score070.setBounds(541,220,61,30);
		judge1score070.addActionListener(this);
		calc.add(judge1score070);
		
		judge1score075 = new JButton("7.5");
		judge1score075.setBounds(541,250,61,30);
		judge1score075.addActionListener(this);
		calc.add(judge1score075);
		
		judge1score080 = new JButton("8");
		judge1score080.setBounds(602,220,61,30);
		judge1score080.addActionListener(this);
		calc.add(judge1score080);
		
		judge1score085 = new JButton("8.5");
		judge1score085.setBounds(602,250,61,30);
		judge1score085.addActionListener(this);
		calc.add(judge1score085);
		
		judge1score090 = new JButton("9");
		judge1score090.setBounds(663,220,61,30);
		judge1score090.addActionListener(this);
		calc.add(judge1score090);
		
		judge1score095 = new JButton("9.5");
		judge1score095.setBounds(663,250,61,30);
		judge1score095.addActionListener(this);
		calc.add(judge1score095);
		
		judge1score100 = new JButton("10");
		judge1score100.setBounds(724,220,61,30);
		judge1score100.addActionListener(this);
		calc.add(judge1score100);
		
		judge1scoreReset = new JButton("CLR");
		judge1scoreReset.setBounds(724,250,61,30);
		judge1scoreReset.addActionListener(this);
		calc.add(judge1scoreReset);
		
		
		judge2 = new JCheckBox("Judge #2");
		judge2.setBounds(7,295,97,30);
		judge2.setBackground(Color.white);
		judge2.addActionListener(this);
		calc.add(judge2);
		
		judge2score000 = new JButton("0");
		judge2score000.setBounds(114,285,61,30);
		judge2score000.addActionListener(this);
		calc.add(judge2score000);
		
		judge2score005 = new JButton("0.5");
		judge2score005.setBounds(114,315,61,30);
		judge2score005.addActionListener(this);
		calc.add(judge2score005);
		
		judge2score010 = new JButton("1");
		judge2score010.setBounds(175,285,61,30);
		judge2score010.addActionListener(this);
		calc.add(judge2score010);
		
		judge2score015 = new JButton("1.5");
		judge2score015.setBounds(175,315,61,30);
		judge2score015.addActionListener(this);
		calc.add(judge2score015);
		
		judge2score020 = new JButton("2");
		judge2score020.setBounds(236,285,61,30);
		judge2score020.addActionListener(this);
		calc.add(judge2score020);
		
		judge2score025 = new JButton("2.5");
		judge2score025.setBounds(236,315,61,30);
		judge2score025.addActionListener(this);
		calc.add(judge2score025);
		
		judge2score030 = new JButton("3");
		judge2score030.setBounds(297,285,61,30);
		judge2score030.addActionListener(this);
		calc.add(judge2score030);
		
		judge2score035 = new JButton("3.5");
		judge2score035.setBounds(297,315,61,30);
		judge2score035.addActionListener(this);
		calc.add(judge2score035);
		
		judge2score040 = new JButton("4");
		judge2score040.setBounds(358,285,61,30);
		judge2score040.addActionListener(this);
		calc.add(judge2score040);
		
		judge2score045 = new JButton("4.5");
		judge2score045.setBounds(358,315,61,30);
		judge2score045.addActionListener(this);
		calc.add(judge2score045);
		
		judge2score050 = new JButton("5");
		judge2score050.setBounds(419,285,61,30);
		judge2score050.addActionListener(this);
		calc.add(judge2score050);
		
		judge2score055 = new JButton("5.5");
		judge2score055.setBounds(419,315,61,30);
		judge2score055.addActionListener(this);
		calc.add(judge2score055);
		
		judge2score060 = new JButton("6");
		judge2score060.setBounds(480,285,61,30);
		judge2score060.addActionListener(this);
		calc.add(judge2score060);
		
		judge2score065 = new JButton("6.5");
		judge2score065.setBounds(480,315,61,30);
		judge2score065.addActionListener(this);
		calc.add(judge2score065);
		
		judge2score070 = new JButton("7");
		judge2score070.setBounds(541,285,61,30);
		judge2score070.addActionListener(this);
		calc.add(judge2score070);
		
		judge2score075 = new JButton("7.5");
		judge2score075.setBounds(541,315,61,30);
		judge2score075.addActionListener(this);
		calc.add(judge2score075);
		
		judge2score080 = new JButton("8");
		judge2score080.setBounds(602,285,61,30);
		judge2score080.addActionListener(this);
		calc.add(judge2score080);
		
		judge2score085 = new JButton("8.5");
		judge2score085.setBounds(602,315,61,30);
		judge2score085.addActionListener(this);
		calc.add(judge2score085);
		
		judge2score090 = new JButton("9");
		judge2score090.setBounds(663,285,61,30);
		judge2score090.addActionListener(this);
		calc.add(judge2score090);
		
		judge2score095 = new JButton("9.5");
		judge2score095.setBounds(663,315,61,30);
		judge2score095.addActionListener(this);
		calc.add(judge2score095);
		
		judge2score100 = new JButton("10");
		judge2score100.setBounds(724,285,61,30);
		judge2score100.addActionListener(this);
		calc.add(judge2score100);
		
		judge2scoreReset = new JButton("CLR");
		judge2scoreReset.setBounds(724,315,61,30);
		judge2scoreReset.addActionListener(this);
		calc.add(judge2scoreReset);
		
		
		judge3 = new JCheckBox("Judge #3");
		judge3.setBounds(7,355,97,30);
		judge3.setBackground(Color.white);
		judge3.addActionListener(this);
		calc.add(judge3);
		
		judge3score000 = new JButton("0");
		judge3score000.setBounds(114,350,61,30);
		judge3score000.addActionListener(this);
		calc.add(judge3score000);
		
		judge3score005 = new JButton("0.5");
		judge3score005.setBounds(114,380,61,30);
		judge3score005.addActionListener(this);
		calc.add(judge3score005);
		
		judge3score010 = new JButton("1");
		judge3score010.setBounds(175,350,61,30);
		judge3score010.addActionListener(this);
		calc.add(judge3score010);
		
		judge3score015 = new JButton("1.5");
		judge3score015.setBounds(175,380,61,30);
		judge3score015.addActionListener(this);
		calc.add(judge3score015);
		
		judge3score020 = new JButton("2");
		judge3score020.setBounds(236,350,61,30);
		judge3score020.addActionListener(this);
		calc.add(judge3score020);
		
		judge3score025 = new JButton("2.5");
		judge3score025.setBounds(236,380,61,30);
		judge3score025.addActionListener(this);
		calc.add(judge3score025);
		
		judge3score030 = new JButton("3");
		judge3score030.setBounds(297,350,61,30);
		judge3score030.addActionListener(this);
		calc.add(judge3score030);
		
		judge3score035 = new JButton("3.5");
		judge3score035.setBounds(297,380,61,30);
		judge3score035.addActionListener(this);
		calc.add(judge3score035);
		
		judge3score040 = new JButton("4");
		judge3score040.setBounds(358,350,61,30);
		judge3score040.addActionListener(this);
		calc.add(judge3score040);
		
		judge3score045 = new JButton("4.5");
		judge3score045.setBounds(358,380,61,30);
		judge3score045.addActionListener(this);
		calc.add(judge3score045);
		
		judge3score050 = new JButton("5");
		judge3score050.setBounds(419,350,61,30);
		judge3score050.addActionListener(this);
		calc.add(judge3score050);
		
		judge3score055 = new JButton("5.5");
		judge3score055.setBounds(419,380,61,30);
		judge3score055.addActionListener(this);
		calc.add(judge3score055);
		
		judge3score060 = new JButton("6");
		judge3score060.setBounds(480,350,61,30);
		judge3score060.addActionListener(this);
		calc.add(judge3score060);
		
		judge3score065 = new JButton("6.5");
		judge3score065.setBounds(480,380,61,30);
		judge3score065.addActionListener(this);
		calc.add(judge3score065);
		
		judge3score070 = new JButton("7");
		judge3score070.setBounds(541,350,61,30);
		judge3score070.addActionListener(this);
		calc.add(judge3score070);
		
		judge3score075 = new JButton("7.5");
		judge3score075.setBounds(541,380,61,30);
		judge3score075.addActionListener(this);
		calc.add(judge3score075);
		
		judge3score080 = new JButton("8");
		judge3score080.setBounds(602,350,61,30);
		judge3score080.addActionListener(this);
		calc.add(judge3score080);
		
		judge3score085 = new JButton("8.5");
		judge3score085.setBounds(602,380,61,30);
		judge3score085.addActionListener(this);
		calc.add(judge3score085);
		
		judge3score090 = new JButton("9");
		judge3score090.setBounds(663,350,61,30);
		judge3score090.addActionListener(this);
		calc.add(judge3score090);
		
		judge3score095 = new JButton("9.5");
		judge3score095.setBounds(663,380,61,30);
		judge3score095.addActionListener(this);
		calc.add(judge3score095);
		
		judge3score100 = new JButton("10");
		judge3score100.setBounds(724,350,61,30);
		judge3score100.addActionListener(this);
		calc.add(judge3score100);
		
		judge3scoreReset = new JButton("CLR");
		judge3scoreReset.setBounds(724,380,61,30);
		judge3scoreReset.addActionListener(this);
		calc.add(judge3scoreReset);
		
		
		judge4 = new JCheckBox("Judge #4");
		judge4.setBounds(7,415,97,30);
		judge4.setBackground(Color.white);
		judge4.addActionListener(this);
		calc.add(judge4);
		
		judge4score000 = new JButton("0");
		judge4score000.setBounds(114,415,61,30);
		judge4score000.addActionListener(this);
		calc.add(judge4score000);
		
		judge4score005 = new JButton("0.5");
		judge4score005.setBounds(114,445,61,30);
		judge4score005.addActionListener(this);
		calc.add(judge4score005);
		
		judge4score010 = new JButton("1");
		judge4score010.setBounds(175,415,61,30);
		judge4score010.addActionListener(this);
		calc.add(judge4score010);
		
		judge4score015 = new JButton("1.5");
		judge4score015.setBounds(175,445,61,30);
		judge4score015.addActionListener(this);
		calc.add(judge4score015);
		
		judge4score020 = new JButton("2");
		judge4score020.setBounds(236,415,61,30);
		judge4score020.addActionListener(this);
		calc.add(judge4score020);
		
		judge4score025 = new JButton("2.5");
		judge4score025.setBounds(236,445,61,30);
		judge4score025.addActionListener(this);
		calc.add(judge4score025);
		
		judge4score030 = new JButton("3");
		judge4score030.setBounds(297,415,61,30);
		judge4score030.addActionListener(this);
		calc.add(judge4score030);
		
		judge4score035 = new JButton("3.5");
		judge4score035.setBounds(297,445,61,30);
		judge4score035.addActionListener(this);
		calc.add(judge4score035);
		
		judge4score040 = new JButton("4");
		judge4score040.setBounds(358,415,61,30);
		judge4score040.addActionListener(this);
		calc.add(judge4score040);
		
		judge4score045 = new JButton("4.5");
		judge4score045.setBounds(358,445,61,30);
		judge4score045.addActionListener(this);
		calc.add(judge4score045);
		
		judge4score050 = new JButton("5");
		judge4score050.setBounds(419,415,61,30);
		judge4score050.addActionListener(this);
		calc.add(judge4score050);
		
		judge4score055 = new JButton("5.5");
		judge4score055.setBounds(419,445,61,30);
		judge4score055.addActionListener(this);
		calc.add(judge4score055);
		
		judge4score060 = new JButton("6");
		judge4score060.setBounds(480,415,61,30);
		judge4score060.addActionListener(this);
		calc.add(judge4score060);
		
		judge4score065 = new JButton("6.5");
		judge4score065.setBounds(480,445,61,30);
		judge4score065.addActionListener(this);
		calc.add(judge4score065);
		
		judge4score070 = new JButton("7");
		judge4score070.setBounds(541,415,61,30);
		judge4score070.addActionListener(this);
		calc.add(judge4score070);
		
		judge4score075 = new JButton("7.5");
		judge4score075.setBounds(541,445,61,30);
		judge4score075.addActionListener(this);
		calc.add(judge4score075);
		
		judge4score080 = new JButton("8");
		judge4score080.setBounds(602,415,61,30);
		judge4score080.addActionListener(this);
		calc.add(judge4score080);
		
		judge4score085 = new JButton("8.5");
		judge4score085.setBounds(602,445,61,30);
		judge4score085.addActionListener(this);
		calc.add(judge4score085);
		
		judge4score090 = new JButton("9");
		judge4score090.setBounds(663,415,61,30);
		judge4score090.addActionListener(this);
		calc.add(judge4score090);
		
		judge4score095 = new JButton("9.5");
		judge4score095.setBounds(663,445,61,30);
		judge4score095.addActionListener(this);
		calc.add(judge4score095);
		
		judge4score100 = new JButton("10");
		judge4score100.setBounds(724,415,61,30);
		judge4score100.addActionListener(this);
		calc.add(judge4score100);
		
		judge4scoreReset = new JButton("CLR");
		judge4scoreReset.setBounds(724,445,61,30);
		judge4scoreReset.addActionListener(this);
		calc.add(judge4scoreReset);
		
		
		judge5 = new JCheckBox("Judge #5");
		judge5.setBounds(7,475,97,30);
		judge5.setBackground(Color.white);
		judge5.addActionListener(this);
		calc.add(judge5);
		
		judge5score000 = new JButton("0");
		judge5score000.setBounds(114,480,61,30);
		judge5score000.addActionListener(this);
		calc.add(judge5score000);
		
		judge5score005 = new JButton("0.5");
		judge5score005.setBounds(114,510,61,30);
		judge5score005.addActionListener(this);
		calc.add(judge5score005);
		
		judge5score010 = new JButton("1");
		judge5score010.setBounds(175,480,61,30);
		judge5score010.addActionListener(this);
		calc.add(judge5score010);
		
		judge5score015 = new JButton("1.5");
		judge5score015.setBounds(175,510,61,30);
		judge5score015.addActionListener(this);
		calc.add(judge5score015);
		
		judge5score020 = new JButton("2");
		judge5score020.setBounds(236,480,61,30);
		judge5score020.addActionListener(this);
		calc.add(judge5score020);
		
		judge5score025 = new JButton("2.5");
		judge5score025.setBounds(236,510,61,30);
		judge5score025.addActionListener(this);
		calc.add(judge5score025);
		
		judge5score030 = new JButton("3");
		judge5score030.setBounds(297,480,61,30);
		judge5score030.addActionListener(this);
		calc.add(judge5score030);
		
		judge5score035 = new JButton("3.5");
		judge5score035.setBounds(297,510,61,30);
		judge5score035.addActionListener(this);
		calc.add(judge5score035);
		
		judge5score040 = new JButton("4");
		judge5score040.setBounds(358,480,61,30);
		judge5score040.addActionListener(this);
		calc.add(judge5score040);
		
		judge5score045 = new JButton("4.5");
		judge5score045.setBounds(358,510,61,30);
		judge5score045.addActionListener(this);
		calc.add(judge5score045);
		
		judge5score050 = new JButton("5");
		judge5score050.setBounds(419,480,61,30);
		judge5score050.addActionListener(this);
		calc.add(judge5score050);
		
		judge5score055 = new JButton("5.5");
		judge5score055.setBounds(419,510,61,30);
		judge5score055.addActionListener(this);
		calc.add(judge5score055);
		
		judge5score060 = new JButton("6");
		judge5score060.setBounds(480,480,61,30);
		judge5score060.addActionListener(this);
		calc.add(judge5score060);
		
		judge5score065 = new JButton("6.5");
		judge5score065.setBounds(480,510,61,30);
		judge5score065.addActionListener(this);
		calc.add(judge5score065);
		
		judge5score070 = new JButton("7");
		judge5score070.setBounds(541,480,61,30);
		judge5score070.addActionListener(this);
		calc.add(judge5score070);
		
		judge5score075 = new JButton("7.5");
		judge5score075.setBounds(541,510,61,30);
		judge5score075.addActionListener(this);
		calc.add(judge5score075);
		
		judge5score080 = new JButton("8");
		judge5score080.setBounds(602,480,61,30);
		judge5score080.addActionListener(this);
		calc.add(judge5score080);
		
		judge5score085 = new JButton("8.5");
		judge5score085.setBounds(602,510,61,30);
		judge5score085.addActionListener(this);
		calc.add(judge5score085);
		
		judge5score090 = new JButton("9");
		judge5score090.setBounds(663,480,61,30);
		judge5score090.addActionListener(this);
		calc.add(judge5score090);
		
		judge5score095 = new JButton("9.5");
		judge5score095.setBounds(663,510,61,30);
		judge5score095.addActionListener(this);
		calc.add(judge5score095);
		
		judge5score100 = new JButton("10");
		judge5score100.setBounds(724,480,61,30);
		judge5score100.addActionListener(this);
		calc.add(judge5score100);
		
		judge5scoreReset = new JButton("CLR");
		judge5scoreReset.setBounds(724,510,61,30);
		judge5scoreReset.addActionListener(this);
		calc.add(judge5scoreReset);
		
		
		judge6 = new JCheckBox("Judge #6");
		judge6.setBounds(7,535,97,30);
		judge6.setBackground(Color.white);
		judge6.addActionListener(this);
		calc.add(judge6);
		
		judge6score000 = new JButton("0");
		judge6score000.setBounds(114,545,61,30);
		judge6score000.addActionListener(this);
		calc.add(judge6score000);
		
		judge6score005 = new JButton("0.5");
		judge6score005.setBounds(114,575,61,30);
		judge6score005.addActionListener(this);
		calc.add(judge6score005);
		
		judge6score010 = new JButton("1");
		judge6score010.setBounds(175,545,61,30);
		judge6score010.addActionListener(this);
		calc.add(judge6score010);
		
		judge6score015 = new JButton("1.5");
		judge6score015.setBounds(175,575,61,30);
		judge6score015.addActionListener(this);
		calc.add(judge6score015);
		
		judge6score020 = new JButton("2");
		judge6score020.setBounds(236,545,61,30);
		judge6score020.addActionListener(this);
		calc.add(judge6score020);
		
		judge6score025 = new JButton("2.5");
		judge6score025.setBounds(236,575,61,30);
		judge6score025.addActionListener(this);
		calc.add(judge6score025);
		
		judge6score030 = new JButton("3");
		judge6score030.setBounds(297,545,61,30);
		judge6score030.addActionListener(this);
		calc.add(judge6score030);
		
		judge6score035 = new JButton("3.5");
		judge6score035.setBounds(297,575,61,30);
		judge6score035.addActionListener(this);
		calc.add(judge6score035);
		
		judge6score040 = new JButton("4");
		judge6score040.setBounds(358,545,61,30);
		judge6score040.addActionListener(this);
		calc.add(judge6score040);
		
		judge6score045 = new JButton("4.5");
		judge6score045.setBounds(358,575,61,30);
		judge6score045.addActionListener(this);
		calc.add(judge6score045);
		
		judge6score050 = new JButton("5");
		judge6score050.setBounds(419,545,61,30);
		judge6score050.addActionListener(this);
		calc.add(judge6score050);
		
		judge6score055 = new JButton("5.5");
		judge6score055.setBounds(419,575,61,30);
		judge6score055.addActionListener(this);
		calc.add(judge6score055);
		
		judge6score060 = new JButton("6");
		judge6score060.setBounds(480,545,61,30);
		judge6score060.addActionListener(this);
		calc.add(judge6score060);
		
		judge6score065 = new JButton("6.5");
		judge6score065.setBounds(480,575,61,30);
		judge6score065.addActionListener(this);
		calc.add(judge6score065);
		
		judge6score070 = new JButton("7");
		judge6score070.setBounds(541,545,61,30);
		judge6score070.addActionListener(this);
		calc.add(judge6score070);
		
		judge6score075 = new JButton("7.5");
		judge6score075.setBounds(541,575,61,30);
		judge6score075.addActionListener(this);
		calc.add(judge6score075);
		
		judge6score080 = new JButton("8");
		judge6score080.setBounds(602,545,61,30);
		judge6score080.addActionListener(this);
		calc.add(judge6score080);
		
		judge6score085 = new JButton("8.5");
		judge6score085.setBounds(602,575,61,30);
		judge6score085.addActionListener(this);
		calc.add(judge6score085);
		
		judge6score090 = new JButton("9");
		judge6score090.setBounds(663,545,61,30);
		judge6score090.addActionListener(this);
		calc.add(judge6score090);
		
		judge6score095 = new JButton("9.5");
		judge6score095.setBounds(663,575,61,30);
		judge6score095.addActionListener(this);
		calc.add(judge6score095);
		
		judge6score100 = new JButton("10");
		judge6score100.setBounds(724,545,61,30);
		judge6score100.addActionListener(this);
		calc.add(judge6score100);
		
		judge6scoreReset = new JButton("CLR");
		judge6scoreReset.setBounds(724,575,61,30);
		judge6scoreReset.addActionListener(this);
		calc.add(judge6scoreReset);
		
		
		judge7 = new JCheckBox("Judge #7");
		judge7.setBounds(7,595,97,30);
		judge7.setBackground(Color.white);
		judge7.addActionListener(this);
		calc.add(judge7);
		
		judge7score000 = new JButton("0");
		judge7score000.setBounds(114,610,61,30);
		judge7score000.addActionListener(this);
		calc.add(judge7score000);
		
		judge7score005 = new JButton("0.5");
		judge7score005.setBounds(114,640,61,30);
		judge7score005.addActionListener(this);
		calc.add(judge7score005);
		
		judge7score010 = new JButton("1");
		judge7score010.setBounds(175,610,61,30);
		judge7score010.addActionListener(this);
		calc.add(judge7score010);
		
		judge7score015 = new JButton("1.5");
		judge7score015.setBounds(175,640,61,30);
		judge7score015.addActionListener(this);
		calc.add(judge7score015);
		
		judge7score020 = new JButton("2");
		judge7score020.setBounds(236,610,61,30);
		judge7score020.addActionListener(this);
		calc.add(judge7score020);
		
		judge7score025 = new JButton("2.5");
		judge7score025.setBounds(236,640,61,30);
		judge7score025.addActionListener(this);
		calc.add(judge7score025);
		
		judge7score030 = new JButton("3");
		judge7score030.setBounds(297,610,61,30);
		judge7score030.addActionListener(this);
		calc.add(judge7score030);
		
		judge7score035 = new JButton("3.5");
		judge7score035.setBounds(297,640,61,30);
		judge7score035.addActionListener(this);
		calc.add(judge7score035);
		
		judge7score040 = new JButton("4");
		judge7score040.setBounds(358,610,61,30);
		judge7score040.addActionListener(this);
		calc.add(judge7score040);
		
		judge7score045 = new JButton("4.5");
		judge7score045.setBounds(358,640,61,30);
		judge7score045.addActionListener(this);
		calc.add(judge7score045);
		
		judge7score050 = new JButton("5");
		judge7score050.setBounds(419,610,61,30);
		judge7score050.addActionListener(this);
		calc.add(judge7score050);
		
		judge7score055 = new JButton("5.5");
		judge7score055.setBounds(419,640,61,30);
		judge7score055.addActionListener(this);
		calc.add(judge7score055);
		
		judge7score060 = new JButton("6");
		judge7score060.setBounds(480,610,61,30);
		judge7score060.addActionListener(this);
		calc.add(judge7score060);
		
		judge7score065 = new JButton("6.5");
		judge7score065.setBounds(480,640,61,30);
		judge7score065.addActionListener(this);
		calc.add(judge7score065);
		
		judge7score070 = new JButton("7");
		judge7score070.setBounds(541,610,61,30);
		judge7score070.addActionListener(this);
		calc.add(judge7score070);
		
		judge7score075 = new JButton("7.5");
		judge7score075.setBounds(541,640,61,30);
		judge7score075.addActionListener(this);
		calc.add(judge7score075);
		
		judge7score080 = new JButton("8");
		judge7score080.setBounds(602,610,61,30);
		judge7score080.addActionListener(this);
		calc.add(judge7score080);
		
		judge7score085 = new JButton("8.5");
		judge7score085.setBounds(602,640,61,30);
		judge7score085.addActionListener(this);
		calc.add(judge7score085);
		
		judge7score090 = new JButton("9");
		judge7score090.setBounds(663,610,61,30);
		judge7score090.addActionListener(this);
		calc.add(judge7score090);
		
		judge7score095 = new JButton("9.5");
		judge7score095.setBounds(663,640,61,30);
		judge7score095.addActionListener(this);
		calc.add(judge7score095);
		
		judge7score100 = new JButton("10");
		judge7score100.setBounds(724,610,61,30);
		judge7score100.addActionListener(this);
		calc.add(judge7score100);
		
		judge7scoreReset = new JButton("CLR");
		judge7scoreReset.setBounds(724,640,61,30);
		judge7scoreReset.addActionListener(this);
		calc.add(judge7scoreReset);
		
			
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}
		
	public void actionPerformed ( ActionEvent event) {
		Object evt = event.getSource();
		
		}
		
	public static void main ( String[] args ) {
		DiveCalculator diveCalc = new DiveCalculator();
		diveCalc.show();
		}
	}