import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.Random;





/** RUN FIRST
 * 
 * 
 * 
 * READ THE CONSOLE FOR DIRECTIONS
 * 
 * 
 * 
 * AS STARTED LATER, IGNORE THE TILES TO THE TOP LEFT; YOU CAN UTILIZE ANY LETTER ON THE KEYBOARD
 * 
 * 
 * 
 * DON'T LOOK AT THE STRING DECLARATIONS (AKA DON'T CHEAT)
 * 
 * 
 * 
 * REMEMBER, IT'S ALL COMPUTER SCIENCE WORDS
 * 
 * 
 * 
 * **/





public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	Background b = new Background(0, 0);
	
	JTextField textField = new JTextField();
	
	boolean help;
	boolean help2;
	boolean help3;
	boolean help4;
	boolean help5;

	Tile t1 = new Tile(-270, -230);
	Tile t2 = new Tile(-270, -80);
	Tile t3 = new Tile(-270, 70);
	Tile t4 = new Tile(-270, 220);
	Tile t5 = new Tile(-270, 370);
	
	// Maybe add every letter in the alphabet as PNGs and then paint those onto the tile
	// Edit: I don't need to do this :)
	
	RandomLetter l1 = new RandomLetter(5, 4);
	RandomLetter l2 = new RandomLetter(5, 4);
	RandomLetter l3 = new RandomLetter(5, 4);
	RandomLetter l4 = new RandomLetter(5, 4);
	RandomLetter l5 = new RandomLetter(5, 4);
	
	Tile t6 = new Tile(270, -200);
	Tile t7 = new Tile(270, -50);
	Tile t8 = new Tile(270, 100);
	Tile t9 = new Tile(270, 250);
	Tile t10 = new Tile(270, 400);
	
	/* Random r = new Random();
	char c = (char)(r.nextInt(26) + 'a');
	//String s = toString(c);
	String lowercase = String.valueOf(c);
	String randomLetter = lowercase.toUpperCase(); */
	String s = "test";
	
	String guess = "";
	
	String o = "";
	String t = "";
	String th = "";
	String fo = "";
	String fi = "";
	
	String mysteryWord1 = "ERROR";
	String mysteryWord2 = "CLASS";
	String mysteryWord3 = "INDEX";
	String mysteryWord4 = "SUPER";
	String mysteryWord5 = "WHILE";
	
	Timer time = new Timer(16, this);
	public Frame() {
		
		JFrame f = new JFrame("Mystery Word Guessing Game");
		f.setSize(new Dimension(1000, 1000));
		f.setBackground(Color.red);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		
		f.addMouseListener(this);
 

		textField.setBounds(10, 10, 300, 100);
		
		// textField.setColumns(...); Change number of columns to change width of the textField
		// Look into this method and see if you can change width with it
		// Edit: doesn't work :/
		
		Container pane = f.getContentPane();
		this.setSize(new Dimension(1000, 1000));
		pane.add(textField, BorderLayout.SOUTH);
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		textField.setFont(new Font("Verdana", Font.BOLD, 39));
		textField.addKeyListener(this);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("!!!Mystery Word Length is ALWAYS 5 Letters!!!");
		System.out.println("The Mystery Word is related to JAVA, and there");
		System.out.println("are five possible words you can win with");
		
		System.out.println("");
		
		System.out.println("To make it aesthetically pleasing, the keyboard is in uppercase.");
		System.out.println("If you can't make a word out of the letters provided,");
		System.out.println("rerun until viable letters are created.");
		System.out.println("Even if the word isn't the right guess, the system will still acknowledge");
		System.out.println("the existence of the word by painting it onto the JFrame");
		System.out.println("IGNORE THE TILES ON THE FAR LEFT; THEY WERE ORIGINALLY GOING TO BE USED");
		System.out.println("BUT COMPLICATIONS AROSE SO THEY'RE NOW JUST THERE FOR AESTHETIC PURPOSES");
		
		System.out.println("");
		
		System.out.println("To insert a guess, press ENTER");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Updates:");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		/* Spellchecker [2.] Spell-Check (this might be obsolete since the word has been limited to JAVA and Computer Science)
		
	    String word = "hello";
		int x = 0;
		
		if(x == 0 && word == "hello") {
		
			System.out.println("true");
		
		} else {
		
			System.out.println("false");	
			
		}
		
		If the word inputted is a real word, then it equals true
		
		Implement a spell-checker to spell-check the word that is put in.
		
		If it's not a word, underline it with a red squiggly
		
		If it is, don't.
		
		*/
	 	time.start();

	}
	
	public String generateRandomLetter() {
		
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		//String s = toString(c);
		String lowercase = String.valueOf(c);
		String randomLetter = lowercase.toUpperCase();
		
		return randomLetter;
		
	}
	
	public int getLength() {
		
		String text = textField.getText();
		guess = textField.getText();
		
		return text.length();
		
	}
	
	
	public void paint(Graphics g) { 
		
		super.paintComponent(g);
		
	 	b.paint(g);
		t1.paint(g);
		t2.paint(g);
		t3.paint(g);
		t4.paint(g);
		t5.paint(g);
		
		for(int i = 0; i < 6; i++) {
			
			if(i == 1) {
				o = generateRandomLetter();
				g.drawString(o, 58, 80);
			}
			
			if(i == 2) {
				t = generateRandomLetter();
				g.drawString(t, 58, 230);
			}
			
			if(i == 3) {
				th = generateRandomLetter();
				g.drawString(th, 58, 380);
			}
			
			if(i == 4) {
				fo = generateRandomLetter();
				g.drawString(fo, 58, 530);
			}

			if(i == 5) {
				fi = generateRandomLetter();
				g.drawString(fi, 58, 680);
			}			
			
			if(help == true) {
				
				t6.paint(g);
				g.drawString("Mystery Word 1!", 560, 110);
				
			}
			
			if(help2 == true) {
				
				t7.paint(g);
				g.drawString("Mystery Word 2!", 560, 260);
				
			}

			if(help3 == true) {
				
				t8.paint(g);
				g.drawString("Mystery Word 3!", 560, 410);
	
			}

			if(help4 == true) {
	
				t9.paint(g);
				g.drawString("Mystery Word 4!", 560, 560);
	
			}

			if(help5 == true) {
	
				t10.paint(g);
				g.drawString("Mystery Word 5!", 560, 710);
	
			}
			
	/*		(270, -200);
			(270, -50);
			(270, 100);
			(270, 250);
			(270, 400);		*/
			
			
			
			
		}
		
		/*
		g.drawString(randomLetter, 58, 80);
		g.drawString(randomLetter, 58, 230);
		g.drawString(randomLetter, 58, 380);
		g.drawString(randomLetter, 58, 530);
		g.drawString(randomLetter, 58, 680);
		*/
		
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Here (Does Fire)"); // Checks to make sure it "fires"
		
		if(arg0.getXOnScreen() > 28 && arg0.getXOnScreen() < 103 && arg0.getYOnScreen() > 50 && arg0.getYOnScreen() < 135) {
			textField.setText(textField.getText() + o);
		}
		
		if(arg0.getXOnScreen() > 28 && arg0.getXOnScreen() < 103 && arg0.getYOnScreen() > 200 && arg0.getYOnScreen() < 285) {
			textField.setText(textField.getText() + t);
		}
		
		if(arg0.getXOnScreen() > 28 && arg0.getXOnScreen() < 103 &&  arg0.getYOnScreen() > 350 && arg0.getYOnScreen() < 435) {
			textField.setText(textField.getText() + th);
		}
		
		if(arg0.getXOnScreen() > 28 && arg0.getXOnScreen() < 103 && arg0.getYOnScreen() > 500 && arg0.getYOnScreen() < 585) {
			textField.setText(textField.getText() + fo);
		}
		
		if(arg0.getXOnScreen() > 28 && arg0.getXOnScreen() < 103 && arg0.getYOnScreen() > 650 && arg0.getYOnScreen() < 735) {
			textField.setText(textField.getText() + fi);
		}
		
		// FIXED THE MARGINS
		
		/*if(t1.mouseClicked) {
			textField.
		}
		
		if(){
		 l.paint(g);
		} */
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		repaint();
		//time.stop();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
	 
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub		
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode()+"key");
		
		if(getLength() == 5) {
		
			if(arg0.getKeyCode() == 0 /*Also if a word is inputted, so this could be an outer if-statement*/) {
			
					System.out.println("Here (Entering Word Works)"); // Test
				
					if(guess.equals(mysteryWord1)) {
						
						help = true;
						
					}
					
					if(guess.equals(mysteryWord2)) {
						
						help2 = true;
						
					}

					if(guess.equals(mysteryWord3)) {
			
						help3 = true;
			
					}

					if(guess.equals(mysteryWord4)) {
			
						help4 = true;
			
					}

					if(guess.equals(mysteryWord5)) {
			
						help5 = true;
			
					} else {
						
						System.out.println(guess);
						
					}
					
					// Draw String of the word onto the JFrame
			
			}
		
		}
	
	}
		
	// Things Left To Do:
	
	// 1. Fix the randomizer
	
	// 3. ENTER on the Keyboard
	
	// 4. If the word is not the right answer, print it out onto the console
	
	// 5. If the word is the right answer, then paint it onto the JFrame with a win message
	
}