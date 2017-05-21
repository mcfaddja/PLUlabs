import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import java.lang.*;


public class GameOfLife extends JFrame implements ActionListener {
	private final int FRAME_WIDTH = 620;
	private final int FRAME_HEIGHT = 620;
	private final int FRAME_X_ORIGIN = 100;
	private final int FRAME_Y_ORIGIN = 100;
	private final int WIDTH_OF_BUTTONS = 550;
	private final int HEIGHT_OF_BUTTONS = 550;
	
	private JButton[][] cells1;
	private JButton step;
	private JButton reset;
	private JButton rules;
	private JButton animate;
	
	public Timer animation;
	
	int R = 25;
	int C = 25;
	Color DEAD = Color.white;
	Color LIVE = Color.black;
	
	int sum;
	
	
	public GameOfLife() {
		Container society;
		setTitle			( "The Game of Life" );
		setSize			( FRAME_WIDTH, FRAME_HEIGHT );
		setLocation		( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
		society = getContentPane();
		society.setLayout(null);
		
		cells1 = new JButton[R][C];
		for (int i = 0; i < R; i++ ){
			for (int j = 0; j < C; j++ ) {
				cells1[i][j] = new JButton();
				cells1[i][j].setBounds( 50 + i * 20, 20 + j * 20, 20, 20 );
				cells1[i][j].setText("");
				cells1[i][j].setBackground(DEAD);
				society.add(cells1[i][j]);
				
				cells1[i][j].addActionListener(this);
				}
			}
		
		
		step = new JButton();
		step.setBounds( 50, 540, 90, 30 );
		step.setText("Step");
		society.add(step);
		
		step.addActionListener(this);
		
		
		reset = new JButton();
		reset.setBounds( 153, 540, 90, 30 );
		reset.setText("Reset");
		society.add(reset);
		
		reset.addActionListener(this);
		
		rules = new JButton();
		rules.setBounds( 256, 540, 190, 30 );
		rules.setText( "Display Game Rules" );
		society.add(rules);
		
		rules.addActionListener(this);
		
		animate = new JButton();
		animate.setBounds( 459, 540, 90, 30 );
		animate.setText("Animate!");
		society.add(animate);
		
		animate.addActionListener(this);
		
		
		animation = new Timer(500, this);
		
		
		setDefaultCloseOperation ( EXIT_ON_CLOSE );
		}
		
	public void actionPerformed ( ActionEvent event ) {
		Object evt = event.getSource();
		if (evt == animation) {
			nextGen();
			return;
			}
		
		JButton button;
		button = (JButton) event.getSource();
		
		if (button == reset) {
			animation.stop();
			for (int i = 0; i < C; i++) {
				for (int j = 0; j < R; j++) {
					cells1[i][j].setBackground(DEAD);
					}
				}
			}
		else if (button == step) {
			animation.stop();
			nextGen();
			}
		else if (button == rules) {
			animation.stop();
			JOptionPane.showMessageDialog( null, "The Rules of the Game of Life are as follows. \n" +
															 "\n" + "\n" +
															 "A live cell: \n" +
															 "          *  Remains alive if it has two or three live neighbors. \n" +
															 "          *  Dies from overcrowding if it has more than three live neighbors. \n" +
															 "          *  Dies from isolation if it has less than two live neighbors. \n" +
															 "A dead cell: \n" +
															 "          *  Becomes alive if it has exactly three live neighbors \n" +
															 "          *  Remains dead otherwise. \n" + 
															 "\n" +
															 "A cell's neighbors consist of the eight cells around it.");
			}
		else if(button == animate) {
			animation.stop();
			animation.start();
			}
		else {
			animation.stop();
			if (button.getBackground() == DEAD) {
				button.setBackground(LIVE);
				}
			else if (button.getBackground() == LIVE) {
				button.setBackground(DEAD);
				}
			}
		}
	
	public void nextGen() {
		
			
		Color[][] cells = new Color [R][C];
		for (int i = 0; i < (R); i++) {
			for (int j = 0; j < (C); j++) {
				cells[i][j] = cells1[i][j].getBackground();
				}
			}
				
		for (int i = 0; i<(R-1); i++) {
			for (int j = 0; j<(C-1); j++) {
				sum = 0;
				if (i != 0 && i != 24 && j != 0 && j != 24) {
					if (cells[(i-1)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (i == 0 && j != 0 && j != 24) {
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (i == 0 && j == 0) {
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (j == 0 && i != 0 && i != 24) {
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (j == 0 && i == 24) {
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (i == 24 && j != 0 && j != 24) {
					if (cells[(i-1)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (i == 24 && j == 24) {
					if (cells[(i-1)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j-1)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if (j == 24 && i != 0 && i != 24) {
					if (cells[(i-1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i-1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					}
				else if ( i == 0 && j == 24) {
					if (cells[(i)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j+1)] == LIVE) {
						sum = sum + 1;
						}
					if (cells[(i+1)][(j)] == LIVE) {
						sum = sum + 1;
						}
					}
				if (cells[i][j] == LIVE) {
					if (sum != 2 && sum != 3) {
						cells1[i][j].setBackground(DEAD);
						}
					}
				else if (cells[i][j] == (DEAD) && sum == 3) {
					cells1[i][j].setBackground(LIVE);
					}	
									
				}
			}
		}
		
	public static void main ( String[] args ) {
		GameOfLife life = new GameOfLife();
		life.show();
		}
	}
