import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;



public class WordSearchGame extends JFrame implements ActionListener {

	private final int FRAME_HEIGHT = 500;
	private final int FRAME_WIDTH = 400;
	private final int FRAME_X_ORIGIN = 100;
	private final int FRAME_Y_ORIGIN = 100;
	
	
	private JLabel wordGameLabel;
	private JLabel enterWordLabel;
	private JTextField searchWordField;
	private JTextArea gameTextArea;
	private JScrollPane gameTextAreaScroller;
	private JButton processButton;
	private JButton rulesButton;
	private JButton newGameButton;
	
	
	int dictionaryCount;
	String[] dictionary = new String [300000];
	String searchWord;
	
	int score;
	
	int guessWordsCount;
	String[] guessWords;
	
	public WordSearchGame() {
		Container wordGame;
		setTitle			( "Word Search Game" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		wordGame = getContentPane();
		wordGame.setLayout(null);
		
		wordGameLabel = new JLabel();
		wordGameLabel.setText("Word Search Game");
		//wordGameLabel.setFont(new Font("Courier", BOLD, 20));
		wordGameLabel.setBounds(145,20,150,20);
		wordGameLabel.setForeground(Color.yellow);
		wordGame.add(wordGameLabel);
		
		enterWordLabel = new JLabel();
		enterWordLabel.setText("Enter all the words you can from the letters in:");
		enterWordLabel.setBounds(70, 50, 300, 20 );
		enterWordLabel.setForeground(Color.black);
		wordGame.add(enterWordLabel);
		
		searchWordField = new JTextField();
		searchWordField.setBounds(150, 80, 100, 30 );
		searchWordField.setBorder(BorderFactory.createLineBorder(Color.black));
		searchWordField.setText("");
		searchWordField.setEditable(false);
		searchWordField.setBackground(Color.white);
		wordGame.add(searchWordField);
		
		gameTextArea = new JTextArea();
		gameTextArea.setBounds(50, 120, 300, 300);
		gameTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
		wordGame.add(gameTextArea);		
		
		processButton = new JButton();
		processButton.setText("Process");
		processButton.setBounds(50, 430, 100, 30);
		wordGame.add(processButton);
		
		processButton.addActionListener(this);
		
		
		rulesButton = new JButton();
		rulesButton.setText("Rules");
		rulesButton.setBounds(150, 430, 100, 30);
		wordGame.add(rulesButton);
		
		rulesButton.addActionListener(this);
		
		
		newGameButton = new JButton();
		newGameButton.setText("New Game");
		newGameButton.setBounds( 250, 430, 100, 30);
		wordGame.add(newGameButton);
		
		newGameButton.addActionListener(this);
		
		
		readDictonary();
		newGame();
		
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );		
		}
		
	public void actionPerformed ( ActionEvent event ) {
		Object evt = event.getSource();
		
		if (evt == processButton) {
			checkPlayerWords();
			processButton.setEnabled(false);
			}
		if (evt == rulesButton) {
			JOptionPane.showMessageDialog( null, "The instruction for the game are: \n" +
															 "\n"+
															 "      -The computer will pick a word at random from the dictionary. \n" +
															 "      -You, the user, will attempt to create as many real words with \n" +
															 "           the letters in the word that the computer has chosen. \n" +
															 "      -When you cannot think of anymore words, press the processButton \n" +
															 "           and the computer will process your entries and determine \n" +
															 "           your score. \n" +
															 "\n" +
															 "\n" +
															 "\n" +
															 "The rules of the game are: \n" +
															 "\n" +
															 "      -The letters used must be in the given word. \n" +
															 "      -A letter can be used only as many times as it apprears in the \n" +
															 "           given work. \n" +
															 "      -Any real word that is in the dictionary is can be used, proper \n"+
															 "           nouns are not in the dictionary and cannot be used.");
			}
		if (evt == newGameButton) {
			newGame();	
			}
		}
	
	public void readDictonary() {
		dictionaryCount = 0;
		try {
			FileReader reader = new FileReader( "words.txt" ) ;
			BufferedReader in = new BufferedReader( reader ) ;
			String line = in.readLine() ;
			while ( line != null ) {
				dictionary[dictionaryCount] = line;
				line = in.readLine() ;
				dictionaryCount++;
				}
			} catch( IOException io ) {
				System.out.println( io ) ;	
				}
		}
		
	public void newGame() {
		searchWord = getSearchWord();
		searchWordField.setText(searchWord);
		score = 0;
		gameTextArea.setText("");
		processButton.setEnabled(true);
		guessWords = new String [100];
		}
				
	public String getSearchWord() {
		int random = (int) (dictionaryCount * Math.random());
		
		return dictionary[random];
		}
		
	public void checkPlayerWords() {
		getPlayerWords();
		gameTextArea.setText("");
		
		for (int i = 0; i < guessWordsCount; i++) {
			String word = guessWords[i];
			boolean inDictionary = searchDictionary(word);
			boolean inWord = inSearchWord(word);
			
			if ( inDictionary == true &&  inWord == true) {
				score = score + 1;
				String record = gameTextArea.getText();
				gameTextArea.setText( record + "\n" + word );
				}
			else if (inWord == false) {
				String record = gameTextArea.getText();
				gameTextArea.setText( record + "\n" + word + "    -- characters not in the search word");
				}
			else if (inDictionary == false) {
				String record = gameTextArea.getText();
				gameTextArea.setText( record + "\n" + word + "    -- word not found in dictionary");
				}
			}
		
		String record = gameTextArea.getText();
		gameTextArea.setText( record + "\n" + "Score: " + score);
		}
		
	public void getPlayerWords() {
		StringTokenizer tok;
		guessWordsCount = 0;
		
		tok = new StringTokenizer( gameTextArea.getText() );
		while (tok.hasMoreTokens() ) {
			guessWords[guessWordsCount] = tok.nextToken();
			guessWordsCount++;
			}
		
		}
		
	public boolean searchDictionary(String word) {
		for (int i = 0; i < dictionaryCount; i++) {
			if (dictionary[i].equals(word)) {
				return true;
				}
			}
		return false;
		}
		
	public boolean inSearchWord(String word) {
		int wordCount[] = new int [26];
		int searchCount[] = new int [26];
		
		wordCount = charCount(word);
		searchCount = charCount(searchWord);
		
		for (int i = 0; i < 26; i++) {
			if (wordCount[i] > searchCount[i]) {
				return false;
				}
			}
		return true;
		}
		
	public int[] charCount(String word) {
		int[] letterCount = new int [26];
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = (int) (ch - 'a');
			letterCount[index] = letterCount[index] + 1;
			}
		return letterCount;
		}
	
	public static void main ( String[] args) {
		WordSearchGame wordGame = new WordSearchGame();
		wordGame.show();
		}	
	}