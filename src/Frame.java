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

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	Background b = new Background(0, 0);
	
	JTextField textField = new JTextField();

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
	
	/* Random r = new Random();
	char c = (char)(r.nextInt(26) + 'a');
	//String s = toString(c);
	String lowercase = String.valueOf(c);
	String randomLetter = lowercase.toUpperCase(); */
	String s = "test";
	
	String o = "";
	String t = "";
	String th = "";
	String fo = "";
	String fi = "";
	
	
	public Frame() {
		
		JFrame f = new JFrame("Mystery Word Guessing Game");
		f.setSize(new Dimension(1000, 1000));
		f.setBackground(Color.red);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();

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
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("!!!Mystery Word Length is ALWAYS 5 Letters!!!");
		System.out.println("To make it aesthetically pleasing, the keyboard is in uppercase.");
		System.out.println("Even if the word isn't the right guess, the system will still acknowledge");
		System.out.println("the existence of the word by painting it onto the JFrame");
		System.out.println("To insert a guess, press ENTER");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Updates:");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	 /* String word = "hello";
		int x = 0;
		
		if(x == 0 && word == "hello") {
		
			System.out.println("true");
		
		} else {
		
			System.out.println("false");
		
		}
		
		If the word inputted is a real word, then it equals true */
		
	}
	
	public String generateRandomLetter() {
		
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		//String s = toString(c);
		String lowercase = String.valueOf(c);
		String randomLetter = lowercase.toUpperCase();
		
		return randomLetter;
		
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
		// FIX THE MARGINS (fixed)
		
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
		
		// Enter to enter guess
		
		if(arg0.getKeyCode() == 10 /*Also if a word is inputted, so this could be an outer if-statement*/) {
			
			System.out.println("Here (Entering Word Works)");
			// Draw String of the word onto the JFrame
			
		}
		
		
	}

	
}