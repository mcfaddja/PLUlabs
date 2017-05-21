import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class GUIGradebook extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH    = 400;
	private static final int FRAME_HEIGHT   = 500;
	private static final int FRAME_X_ORIGIN = 400;
	private static final int FRAME_Y_ORIGIN = 150;

	private JLabel scoreLabel;
	private JTextField scoreField;
	private JLabel countLabel;
	private JTextField countField;
	private JButton statsButton;
	private JButton scoresButton;
	private JButton clearButton;
	private JButton deleteButton;
	private JLabel meanLabel;
	private JTextField meanField;
	private JLabel stdDevLabel;
	private JTextField stdDevField;
	private JTextArea recordArea;
	private JScrollPane recordAreaScroller;

	
	private JMenuBar gradeMenuBar;
	private JMenu gradeMenu;
	private JMenuItem statsDisplay;
	private JMenuItem scoresDisplay;
	private JMenu editMenu;
	private JMenuItem deleteEntry;
	private JMenuItem clearGB;


	double scores [] = new double [12];
	double mean;
	double stdDev;
	double max;
	double min;
	int count = 0;
	String record;
	
	
	public GUIGradebook() {
		Container gradePane;
		setTitle			( "A Not-so-simple Simple Gradebook" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		gradePane = getContentPane();
		gradePane.setLayout(null);
		gradePane.setBackground(Color.white);

		gradeMenu = new JMenu("Grade");

		statsDisplay = new JMenuItem("Statistics");
		statsDisplay.addActionListener(this);
		gradeMenu.add( statsDisplay );

		scoresDisplay = new JMenuItem("Scores");
		scoresDisplay.addActionListener(this);
		gradeMenu.add( scoresDisplay );
		
		editMenu = new JMenu("Edit");

		deleteEntry = new JMenuItem("Delete an entry");
		deleteEntry.addActionListener(this);
		editMenu.add( deleteEntry );

		clearGB = new JMenuItem("Clear the GradeBook");
		clearGB.addActionListener(this);
		editMenu.add( clearGB );

		gradeMenuBar = new JMenuBar();
		setJMenuBar(gradeMenuBar);
		gradeMenuBar.add(gradeMenu);
		gradeMenuBar.add(editMenu);

		scoreLabel = new JLabel();
		scoreLabel.setBounds( 40, 40, 80, 30 );
		scoreLabel.setText("Input Score: " );
		gradePane.add(scoreLabel);

		scoreField = new JTextField();
		scoreField.setBounds( 130, 40, 70, 30 );
		scoreField.setBorder(BorderFactory.createLineBorder(Color.black));
		gradePane.add(scoreField);

		scoreField.addActionListener(this);

		countLabel = new JLabel();
		countLabel.setBounds( 250, 40, 40, 30 );
		countLabel.setText( "Count: ");
		gradePane.add(countLabel);

		countField = new JTextField();
		countField.setBounds( 300, 40, 50, 30 );
		countField.setBorder(BorderFactory.createLineBorder(Color.black));
		countField.setText("" + count);
		countField.setEditable(false);
		countField.setBackground(Color.white);
		gradePane.add(countField);

		statsButton = new JButton();
		statsButton.setBounds( 80, 100, 230, 30 );
		statsButton.setText( "Statitics" );
		gradePane.add(statsButton);

		statsButton.addActionListener(this);

		scoresButton = new JButton();
		scoresButton.setBounds( 80, 140, 230, 30 );
		scoresButton.setText( "Display Scores" );
		gradePane.add(scoresButton);

		scoresButton.addActionListener(this);

		clearButton = new JButton();
		clearButton.setBounds( 80, 180, 230, 30 );
		clearButton.setText( "Clear Gradebook" );
		gradePane.add(clearButton);

		clearButton.addActionListener(this);
		
		deleteButton = new JButton();
		deleteButton.setBounds( 80, 220, 230, 30 );
		deleteButton.setText( "Delete an entry" );
		gradePane.add(deleteButton);
		
		deleteButton.addActionListener(this);
		
		meanLabel = new JLabel();
		meanLabel.setBounds( 75, 260, 35, 30 );
		meanLabel.setText( "Mean:" );
		gradePane.add(meanLabel);
		
		meanField = new JTextField();
		meanField.setBounds( 115, 260, 40, 30 );
		meanField.setBorder(BorderFactory.createLineBorder(Color.black));
		meanField.setEditable(false);
		meanField.setBackground(Color.white);
		gradePane.add(meanField);
		
		stdDevLabel = new JLabel();
		stdDevLabel.setBounds( 160, 260, 110, 30 );
		stdDevLabel.setText( "Standard Deviation:" );
		gradePane.add(stdDevLabel);
		
		stdDevField = new JTextField();
		stdDevField.setBounds( 275, 260, 40, 30 );
		stdDevField.setBorder(BorderFactory.createLineBorder(Color.black));
		stdDevField.setEditable(false);
		stdDevField.setBackground(Color.white);
		gradePane.add(stdDevField);
		
		recordArea = new JTextArea();
		recordArea.setEditable(false);
		recordAreaScroller = new JScrollPane(recordArea);
		recordAreaScroller.setBounds( 75, 300, 240, 135);
		recordAreaScroller.setBorder(BorderFactory.createLineBorder(Color.black));
		gradePane.add(recordAreaScroller);
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}

	public void actionPerformed ( ActionEvent event ) {
		Object evt = event.getSource();

		if (evt == scoreField) {
			int valid;
			
			
			try {
				scores [ count ] = Double.parseDouble(scoreField.getText());
				valid = 1;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "The value entered was not a valid number. \n" +
																	 "Please Enter a valid number.");
					
					valid = 0;
					}			
			
			
			if (valid == 1) {
				count++;
				countField.setText("" + count);
						
				if (count == 1) {
					recordArea.setText( count + "   " + scoreField.getText() + "" );
					record = recordArea.getText();
					}
				
				else {
					record = recordArea.getText();
					recordArea.setText( record + "\n" + count + "   " + scoreField.getText());
					record = recordArea.getText();
				
					DecimalFormat formatter1 = new DecimalFormat("0.0");
					meanField.setText( formatter1.format( mean() ) );
					stdDevField.setText( formatter1.format( stdDev() ) );
					}
			
				scoreField.setText("");
				}
			}
		
		if (evt == statsButton || evt == statsDisplay) {
			record = recordArea.getText();
			DecimalFormat formatter2 = new DecimalFormat("0.0000");
			DecimalFormat formatter3 = new DecimalFormat("0");
			recordArea.setText( "The mean is: " + formatter2.format(mean()) + "\n" + 
									  "The standard deviation is: " + formatter2.format(stdDev()) + "\n" +
									  "The maximum score is: " + formatter3.format(findMax()) + "\n" +
									  "The minimum score is: " + formatter3.format(findMin()));
			}
			
			
		if (evt == scoresButton || evt == scoresDisplay) {
			recordArea.setText( record + "" );
			}
			
		if (evt == clearButton || evt == clearGB) {
			initiGradebook();
			}
			
		if (evt == deleteButton || evt == deleteEntry) {
			int delete;
			int valid;
			String deleteString;
			
			deleteString = JOptionPane.showInputDialog( null, "Enter the number of the score \n" +
														  "that you would like to delete.");
			
			
			try {
				int deleteTester;
				deleteTester = (Integer.parseInt(deleteString) - 1);
				valid = 1;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "The value entered is not a valid number. \n" +
																	 "Please enter a valid number.");
					
					valid = 0;
					}
			
														  
			if (valid == 1) {
				delete = (Integer.parseInt(deleteString) - 1);
				
				if (delete < 0 || delete > (count - 1)) {
					
					JOptionPane.showMessageDialog( null, "The number that you have entered does not corespond \n" +
																	 "to a valid entry number.  Please re-enter the a \n" +
																	 "valid number.");
					}
				
				else {
			
					if ( (delete + 1) == count ) {
						scores [ delete ] = 0;
				
						deleteEntry();
						}
				
					else{
						scores [ delete ] = 0;
			
						while (delete < count) {
							int delete1 = delete + 1;
							scores [ delete ] = scores [ delete1 ];
							delete++;
							}
				
						deleteEntry();
						}
					}
				}
			}
		}
	

	public double mean() {
		double sum = 0;
				
		for (int i = 0; i <= count; i++) {
			sum = sum + scores [ i ];
			}
		
		mean = sum / count;
		
		return mean;
		}

	public double stdDev() {
		double sum = 0;
		double average = mean();
				
		for (int i = 0; i <= count; i++) {
			sum = sum + ( scores [ i ] - average ) * ( scores [ i ] - average );
			}
		
		stdDev = Math.sqrt( sum / count );
		
		return stdDev;
		}
		
	public double findMax() {
		
		max = scores [ 0 ];
		
		for (int i = 1; i <= count; i++) {
			max = Math.max(max, scores[ i ]);
			}
		
		return max;
		}
		
	public double findMin() {
		
		min = scores [ 0 ];
		
		for (int i = 1; i < count; i++) {
			min = Math.min(min, scores[ i ]);
			}
		
		return min;	
		}
	
	public void deleteEntry() {
		count = count - 1;
		DecimalFormat formatter1 = new DecimalFormat("0.0");
		countField.setText("" + count);
		meanField.setText( "" + formatter1.format(mean()) );
		stdDevField.setText("" + formatter1.format(stdDev()) );
			
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				recordArea.setText( (i+1) + "   " + scores [ i ] );
				}
			else {
				record = recordArea.getText();
				recordArea.setText( record + "\n" + (i+1) + "   " + scores [ (i) ] );
				}
			}
		}

	public void strechArray() {
		double copy[] = new double [count];
		
		for (int i = 0; i <= count; i++) {
			scores [i] = copy [i];
			}
			
		scores = new double [ (count + 1) ];
		
		for (int i = 0; i <= count; i++) {
			scores [i] = copy [i];
			}
		}
		
	public void shrinkArray() {
		double copy[] = new double [count];
		
		for (int i = 0; i <= count; i++) {
			scores [i] = copy [i];
			}
			
		scores = new double [ (count - 1) ];
		
		for (int i = 0; i <= count; i++) {
			scores [i] = copy [i];
			}
		}
		
	public void initiGradebook() {
		for (int i = 0; i < count; i++) {
			scores [ i ] = 0;
			}
		mean = 0;
		stdDev = 0;
		max = 0;
		min = 0;
		count = 0;
		String record;
		scoreField.setText("");
		countField.setText("");
		recordArea.setText("");
		meanField.setText("");
		stdDevField.setText("");
		}

	public static void main ( String[] args ) {
		GUIGradebook grade = new GUIGradebook();
		grade.show();
		}

	}