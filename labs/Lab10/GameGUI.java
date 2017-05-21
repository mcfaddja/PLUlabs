import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGUI extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH    = 340;
	private static final int FRAME_HEIGHT   = 340;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;
	
	private JLabel guessLabel;
	private JTextField guessField;
	private JButton guessButton;
	private JLabel resultLabel;
	private JTextField resultField;
	private JButton gameButton;
	private JTextArea guessRecordTextArea;
	private JScrollPane guessRecordTextAreaScroller;
	
	
	int valid;
	int guessNum;
	String guess;
			
			
	
	static int secretNum;
	static int times;
		
	
	public GameGUI() {
		Container gamePane;
		setTitle      ( "A Hi-Lo Guessing Game" );
		setSize       ( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation   ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		gamePane = getContentPane();
		gamePane.setLayout(null);
		
		guessLabel = new JLabel();
		guessLabel.setBounds( 20, 30, 90, 30 );
		guessLabel.setText("Your Guess:");
		gamePane.add(guessLabel);
		
		guessField = new JTextField();
		guessField.setBounds( 110, 30, 110, 30 );
		guessField.setBorder(BorderFactory.createLineBorder(Color.blue));
		gamePane.add(guessField);
		
		guessField.addActionListener(this);
		
		guessButton = new JButton();
		guessButton.setText("Guess");
		guessButton.setBounds( 230, 30, 70, 30 );
		gamePane.add(guessButton);
		
		guessButton.addActionListener(this);
		
		resultLabel = new JLabel();
		resultLabel.setBounds( 20, 100, 60, 30 );
		resultLabel.setText("Result:");
		gamePane.add(resultLabel);
		
		resultField = new JTextField();
		resultField.setBounds( 100, 100, 200, 30 );
		resultField.setBorder(BorderFactory.createLineBorder(Color.blue));
		gamePane.add(resultField);
		
		gameButton = new JButton();
		gameButton.setBounds( 20, 170, 150, 30 );
		gameButton.setText("Play New Game");
		gamePane.add(gameButton);
		
		gameButton.addActionListener(this);
		
		guessRecordTextArea = new JTextArea();
		guessRecordTextArea.setEditable(false);
		guessRecordTextAreaScroller = new JScrollPane(guessRecordTextArea);
		guessRecordTextAreaScroller.setBounds( 180, 170, 120, 110);
		guessRecordTextAreaScroller.setBorder(BorderFactory.createLineBorder(Color.blue));
		gamePane.add(guessRecordTextAreaScroller);
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}
		
	public void actionPerformed( ActionEvent evt ) {
		Object evtSource = evt.getSource();
		
		if (evtSource == guessButton || evtSource == guessField) {
			int valid;
			int guessNum;
			String guess;
			
			
			try {
				String guessTester = guessField.getText();
				int guessNumTester = Integer.parseInt(guessTester);
				valid = 1;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "The text entered was not a valid number. /n" + 
																	 "Please enter a valid number.");
					valid = 0;
					}
			
			
			guess = guessField.getText();
			guessNum = Integer.parseInt(guess);
				
			if ( guessNum > 100 || guessNum < 0 ) {
				JOptionPane.showMessageDialog( null, "The number entered was out of the specified range. /n" +
																 "Please enter a number between 1 and 100.");
				}
			
			
			else if (valid == 1) {

							
				if (guessNum == secretNum && times <= 6) {
					resultField.setText( "Congratulations, You Win!");
					if (times == 1) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				else if (guessNum > secretNum && times < 6) {
					int numLeft = 6 - times;
					times++;
					resultField.setText( "Too high, " + numLeft + " guesses left." );
					guessField.setText( "" );
					if (times == 2) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				else if (guessNum < secretNum && times < 6) {
					int numLeft = 6 - times;
					times++;
					resultField.setText( "Too low, " + numLeft + " guesses left." );
					guessField.setText( "" );
					if (times == 2) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				else if (guessNum > secretNum && times == 6) {
					times++;
					resultField.setText( "Too high, last guess" );
					guessField.setText( "" );
					if (times == 2) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				else if (guessNum < secretNum && times == 6) {
					times++;
					resultField.setText( "Too low, last guess." );
					guessField.setText( "" );
					if (times == 2) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				else if (times > 6 && guessNum != secretNum) {
					resultField.setText( "You lose, the number was " + secretNum + "." );
					if (times == 2) {
						guessRecordTextArea.setText( "" + guess + "" );
						}
					else {
						String record = guessRecordTextArea.getText();
						guessRecordTextArea.setText( "" + record + "\n" + guess + "" );
						}
					}
				}
			}
		
		if (evtSource == gameButton) {
			initiGame();
			resultField.setText( "" );
			guessField.setText( "" );
			guessRecordTextArea.setText( "" );
			}
		}
		
	public static void genSecretNum( ) {
		secretNum = (int) (Math.random() * 100.0);
		}
	
	public static void initiGame() {
		GameGUI game = new GameGUI();
		genSecretNum();
		times = 1;
		}
		
	public static void main( String[] args ) {
		GameGUI game = new GameGUI();
		initiGame();
		game.show();
		}
		
	}
	
	