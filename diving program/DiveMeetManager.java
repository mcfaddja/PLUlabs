import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.io.*;
import java.util.*;

public class DiveMeetManager extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH    = 250;
	private static final int FRAME_HEIGHT   = 307;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 150;
	
	
	
	
	private JMenuBar diveMenuBar;
	
	private JMenu file;
	private JMenuItem newMeet;
	private JMenuItem openMeet;
	private JMenuItem saveMeet;
	private JMenuItem exitMeet;
	
	private JMenu meetSetup;
	private JMenuItem mainSetup;
	private JMenuItem infoSetup;
	private JMenuItem scoringSetup;
	private JMenuItem eventSetup;
	private JMenuItem judgeSetup;
	private JMenuItem diverSetup;
	private JMenuItem orderSetup;
	private JMenuItem entrySetup;
	private JMenuItem teamSetup;
	private JMenuItem tableSetup;
	
	private JMenu meetRun;
	private JMenuItem runRun;
	private JMenuItem checkRun;
	private JMenuItem sheetsRun;
	
	private JMenu meetTools;
	private JMenuItem tableTool;
	private JMenuItem ddTool;
	private JMenuItem importTool;
	private JMenuItem exportTool;
	private JMenuItem transferTool;
	private JMenuItem coloradoTool;
	private JMenuItem daktronicsTool;
	
	private JMenu meetReports;
	private JMenuItem homeReports;
	private JMenuItem sheetReports;
	private JMenuItem tableReports;
	private JMenuItem teamReports;
	private JMenuItem diverReports;
	private JMenuItem entryReports;
	private JMenuItem judgeReports;
	private JMenuItem resultsReports;
	private JMenuItem scoreReports;
	
	private JMenu meetHelp;
	private JMenuItem contentsHelp;
	private JMenuItem searchHelp;
	private JMenuItem faqHelp;
	private JMenuItem aboutHelp;
	
	
	private JButton newButton;
	private JButton openButton;
	private JButton configButton;
	private JButton runButton;
	private JButton checkButton;
	private JButton reportsButton;
	private JButton helpButton;
	private JButton quitButton;
	
	
	
	private String title = ("Dive Meet Manager .1 alpha ");
	
	
	
	public DiveMeetManager() {
		Container dive;
		setTitle			( ""+ title );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		dive = getContentPane();
		dive.setLayout(null);
		dive.setBackground(Color.white);
		
		file = new JMenu("File");
		
		newMeet = new JMenuItem("Create new meet");
		newMeet.addActionListener(this);
		file.add(newMeet);
		
		openMeet = new JMenuItem("Open existing meet");
		openMeet.addActionListener(this);
		file.add(openMeet);
		
		saveMeet = new JMenuItem("Save current meet");
		saveMeet.addActionListener(this);
		file.add(saveMeet);
		
		file.addSeparator();
		
		exitMeet = new JMenuItem( "Quit " + title );
		exitMeet.addActionListener(this);
		file.add(exitMeet);
		
		
		meetSetup = new JMenu("Setup");
		
		mainSetup = new JMenuItem("Configure Meet");
		mainSetup.addActionListener(this);
		meetSetup.add(mainSetup);
		
		meetSetup.addSeparator();
		
		infoSetup = new JMenuItem("Edit meet information and settings");
		infoSetup.addActionListener(this);
		meetSetup.add(infoSetup);
		
		scoringSetup = new JMenuItem("Edit scoring preferences");
		scoringSetup.addActionListener(this);
		meetSetup.add(scoringSetup);
		
		eventSetup = new JMenuItem("Edit events");
		eventSetup.addActionListener(this);
		meetSetup.add(eventSetup);
		
		judgeSetup = new JMenuItem("Edit judging setup");
		judgeSetup.addActionListener(this);
		meetSetup.add(judgeSetup);
		
		meetSetup.addSeparator();
		
		diverSetup = new JMenuItem("Edit divers");
		diverSetup.addActionListener(this);
		meetSetup.add(diverSetup);
		
		orderSetup = new JMenuItem("Edit diving order");
		orderSetup.addActionListener(this);
		meetSetup.add(orderSetup);
		
		entrySetup = new JMenuItem("Edit diver entries");
		entrySetup.addActionListener(this);
		meetSetup.add(entrySetup);
		
		meetSetup.addSeparator();
		
		teamSetup = new JMenuItem("Edit teams");
		teamSetup.addActionListener(this);
		meetSetup.add(teamSetup);
		
		tableSetup = new JMenuItem("Edit DD Table");
		tableSetup.addActionListener(this);
		meetSetup.add(tableSetup);
		
		
		meetRun = new JMenu("Run");
		
		runRun = new JMenuItem("Run current meet");
		runRun.addActionListener(this);
		meetRun.add(runRun);
		
		checkRun = new JMenuItem("Check current meet");
		checkRun.addActionListener(this);
		meetRun.add(checkRun);
		
		sheetsRun = new JMenuItem("Dive Sheets . . . ");
		sheetsRun.addActionListener(this);
		meetRun.add(sheetsRun);
		
		
		meetTools = new JMenu("Tools");
		
		tableTool = new JMenuItem("View DD table");
		tableTool.addActionListener(this);
		meetTools.add(tableTool);
		
		ddTool = new JMenuItem("Look up DD");
		ddTool.addActionListener(this);
		meetTools.add(ddTool);
		
		meetTools.addSeparator();
		
		importTool = new JMenuItem("Import data");
		importTool.addActionListener(this);
		meetTools.add(importTool);
		
		exportTool = new JMenuItem("Export data");
		exportTool.addActionListener(this);
		meetTools.add(exportTool);
		
		transferTool = new JMenuItem("Transfer data");
		transferTool.addActionListener(this);
		meetTools.add(transferTool);
		
		meetTools.addSeparator();
		
		coloradoTool = new JMenuItem("Colorardo Timing Systems");
		coloradoTool.addActionListener(this);
		meetTools.add(coloradoTool);
		
		daktronicsTool = new JMenuItem("Daktronics Timing Systems");
		daktronicsTool.addActionListener(this);
		meetTools.add(daktronicsTool);
		
		
		meetReports = new JMenu("Reports");
		
		homeReports = new JMenuItem("Reports Guide");
		homeReports.addActionListener(this);
		meetReports.add(homeReports);
		
		meetReports.addSeparator();
		
		sheetReports = new JMenuItem("Dive Sheet Reports");
		sheetReports.addActionListener(this);
		meetReports.add(sheetReports);
		
		tableReports = new JMenuItem("DD Table Reports");
		tableReports.addActionListener(this);
		meetReports.add(tableReports);
		
		meetReports.addSeparator();
		
		teamReports = new JMenuItem("Team Reports");
		teamReports.addActionListener(this);
		meetReports.add(teamReports);
				
		judgeReports = new JMenuItem("Judging Reports");
		judgeReports.addActionListener(this);
		meetReports.add(judgeReports);
		
		meetReports.addSeparator();
		
		diverReports = new JMenuItem("Diver Reports");
		diverReports.addActionListener(this);
		meetReports.add(diverReports);
		
		entryReports = new JMenuItem("Entry Reports");
		entryReports.addActionListener(this);
		meetReports.add(entryReports);
		
		meetReports.addSeparator();
		
		resultsReports = new JMenuItem("Results");
		resultsReports.addActionListener(this);
		meetReports.add(resultsReports);
		
		scoreReports = new JMenuItem("Score");
		scoreReports.addActionListener(this);
		meetReports.add(scoreReports);
		
		
		meetHelp = new JMenu("Help");
		
		contentsHelp = new JMenuItem("Contents");
		contentsHelp.addActionListener(this);
		meetHelp.add(contentsHelp);
		
		searchHelp = new JMenuItem("Search help topics");
		searchHelp.addActionListener(this);
		meetHelp.add(searchHelp);
		
		faqHelp = new JMenuItem("Frequently Asked Questions");
		faqHelp.addActionListener(this);
		meetHelp.add(faqHelp);
		
		meetHelp.addSeparator();
		
		aboutHelp = new JMenuItem("About " + title);
		aboutHelp.addActionListener(this);
		meetHelp.add(aboutHelp);
		
		
		
		diveMenuBar = new JMenuBar();
		setJMenuBar(diveMenuBar);
		diveMenuBar.add(file);
		diveMenuBar.add(meetSetup);
		diveMenuBar.add(meetRun);
		diveMenuBar.add(meetTools);
		diveMenuBar.add(meetReports);
		diveMenuBar.add(meetHelp);
		
		
		
		
		
		
		newButton = new JButton("Create New Meet");
		newButton.setBounds(7,10,230,25);
		newButton.addActionListener(this);
		dive.add(newButton);
		
		openButton = new JButton("Open an Existing Meet");
		openButton.setBounds(7,40,230,25);
		openButton.addActionListener(this);
		dive.add(openButton);
		
		configButton = new JButton("Configure Current Meet");
		configButton.setBounds(7,70,230,25);
		configButton.addActionListener(this);
		dive.add(configButton);
		
		runButton = new JButton("Run Current Meet");
		runButton.setBounds(7,100,230,25);
		runButton.addActionListener(this);
		dive.add(runButton);
		
		checkButton = new JButton("Check Current Meet for Errors");
		checkButton.setBounds(7,130,230,25);
		checkButton.addActionListener(this);
		dive.add(checkButton);
		
		reportsButton = new JButton("Create Reports from Current Meet");
		reportsButton.setBounds(7,160,230,25);
		reportsButton.addActionListener(this);
		dive.add(reportsButton);
		
		helpButton = new JButton("HELP!");
		helpButton.setBounds(7,190,230,25);
		helpButton.addActionListener(this);
		dive.add(helpButton);
		
		quitButton = new JButton("Quit "+ title );
		quitButton.setBounds(7,220,230,25);
		quitButton.addActionListener(this);
		dive.add(quitButton);
		
		
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}
	
	public void actionPerformed ( ActionEvent event ) {
		Object evt = event.getSource();
		
		if (evt == exitMeet || evt == quitButton) {
			System.exit(0);
			}
			
		if (evt == newMeet || evt == newButton) {
			CreateMeet newMeet = new CreateMeet();
			newMeet.show();
			}
			
		if (evt == mainSetup || evt == configButton) {
			ConfigureMeet configMeet = new ConfigureMeet();
			configMeet.show();
			}
			
		if (evt == runRun || evt == runButton) {
			RunMeet run = new RunMeet();
			run.show();
			}
			
		if (evt == contentsHelp || evt == helpButton) {
			Help helpme = new Help();
			helpme.show();
			}
			
		if (evt == reportsButton || evt == homeReports) {
			MakeReports report = new MakeReports();
			report.show();
			}
		}
	
	public static void main ( String[] args ) {
		DiveMeetManager diveMM = new DiveMeetManager();
		diveMM.show();
		}	
	}