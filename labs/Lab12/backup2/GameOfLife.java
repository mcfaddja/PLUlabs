import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;


public class GameOfLife extends JFrame implements ActionListener {
	private final int FRAME_WIDTH = 600;
	private final int FRAME_HEIGHT = 600;
	private final int FRAME_X_ORIGIN = 100;
	private final int FRAME_Y_ORIGIN = 100;
	private final int WIDTH_OF_BUTTONS = 550;
	private final int HEIGHT_OF_BUTTONS = 550;
	
	private JButton[][] cells;
	private JButton step;
	private JButton reset;
	
	int R = 25;
	int C = 25;
	Color DEAD = Color.black;
	Color LIVE = Color.white;
	
	
	public GameOfLife() {
		Container society;
		setTitle			( "The Game of Life" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		society = getContentPane();
		society.setLayout(null);
		
		cells = new JButton[R][C];
		for (int i = 0; i < R; i++ ){
			for (int j = 0; j < C; j++ ) {
				cells[i][j] = new JButton();
				cells[i][j].setBounds( 50 + i * 20, 20 + j * 20, 20, 20 );
				cells[i][j].setText("");
				cells[i][j].setBackground(Color.white);
				society.add(cells[i][j]);
				
				cells[i][j].addActionListener(this);
				}
			}
		
		
		step = new JButton();
		step.setBounds( 50, 520, 90, 30 );
		step.setText("Step");
		society.add(step);
		
		step.addActionListener(this);
		
		
		reset = new JButton();
		reset.setBounds( 150, 520, 90, 30 );
		reset.setText("Reset");
		society.add(reset);
		
		reset.addActionListener(this);
		
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}
		
	public void actionPerformed ( ActionEvent event ) {
		//Object evt = event.getScource();
		
		JButton button;
		button = (JButton) event.getSource();
		
		if (button == reset) {
			for (int i = 0; i < C; i++) {
				for (int j = 0; j < R; j++) {
					cells[i][j].setBackground(Color.white);
					}
				}
			}
		else if (button == step) {
			
			for (int i = 0; i < (R-1); i++) {
				for (int j = 0; j < (C-1); j++) {
					int sum = 0;
					if (i == 0 && j == 0) {
						for (int k = i; k <= (i+1); k++) {
							for (int l = j; l <= (j+1); l++ ) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (i == 0 && j != 0 && j != 24 ) {
						
						for (int k = (i-1); k <= (i+1) ; k ++) {
							for (int l = j; l <= (j+1); l++ ) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (i == 0 && j == 24) {
											
						for (int k = (i-1) ; k <= i; k++) {
							for (int l = j; l <= (j+1); l++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (i != 0 && i != 24 && j != 0 && j != 24) {
						
						for (int k = (i-1); k <= (i+1); k++) {
							for (int l = (j-1); l <= (j+1); j++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (i == 24 && j == 0) {
						
						for (int k = i; k <= (i+1); k++) {
							for (int l = (j-1); l <= j ; l++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (i == 24 && j == 24) {
						
						for (int k = (i-1); k == i; k++) {
							for (int l = (j-1); l == j; l++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (j == 0 && i != 0 && i != 24) {
						
						for (int k = i; k <= (i+1); k++) {
							for (int l = (j-1); l <= (j+1); l++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					else if (j == 24 && i != 0 && i != 24) {
						
						for (int k = (i-1); k <= i; k++) {
							for (int l = (j-1); l <= (j+1); l++) {
								if (cells[k][l].getBackground() == Color.black) {
									sum = sum + 1;
									}
								}
							}
						}
					
					if (cells[i][j].getBackground() == Color.black) {
						sum = sum - 1;
						
						if (sum != 2 || sum != 3) {
							cells[i][j].setBackground(Color.white);
							}
						}
					else if (cells[i][j].getBackground() == Color.white) {
						if (sum == 3) {
							cells[i][j].setBackground(Color.black);
							}
						}
					
					}
				}
			}
		else {
			if (button.getBackground() == Color.white) {
				button.setBackground(Color.black);
				}
			else if (button.getBackground() == Color.black) {
				button.setBackground(Color.white);
				}
			}
		}
		
	public static void main ( String[] args ) {
		GameOfLife life = new GameOfLife();
		life.show();
		}
	}