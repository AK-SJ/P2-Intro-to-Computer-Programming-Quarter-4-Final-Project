import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {

	Background b = new Background(0, 0);
	
	Tile t1 = new Tile(-270, -230, "hello");
	Tile t2 = new Tile(-270, -80, "hello");
	Tile t3 = new Tile(-270, 70, "hello");
	Tile t4 = new Tile(-270, 220, "hello");
	Tile t5 = new Tile(-270, 370, "hello");
	
	Letter l1 = new Letter(2, 5);
	Letter l2 = new Letter(2, 5);
	Letter l3 = new Letter(2, 5);
	Letter l4 = new Letter(2, 5);
	Letter l5 = new Letter(2, 5);
	
	// Maybe add every letter in the alphabet as pngs and then paint those onto the tile
	
	public Frame() {
		
		JFrame f = new JFrame("Mystery Word Guessing Game & Spelling Bee");
		f.setSize(new Dimension(1000, 1000));
		f.setBackground(Color.red);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();

		JTextField textField = new JTextField();
		textField.setBounds(10, 10, 300, 100);
		//textField.setColumns(...); Change font to change height of the textfield, but look into this method and see if you can change width with it.
		Container pane = f.getContentPane();
		this.setSize(new Dimension(1000, 1000));
		pane.add(textField, BorderLayout.SOUTH);
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		System.out.println("");
		System.out.println("Word Guess Updates:");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String word = "hello";
		int x = 0;
		
		if(x == 0 && word == "hello") {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// if the word inputted is a real word, then it equals true;
		
	}
	
	public void paint(Graphics g) { 
		
		super.paintComponent(g);
	 	b.paint(g);
		t1.paint(g);
		t2.paint(g);
		t3.paint(g);
		t4.paint(g);
		t5.paint(g);
 		
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		/* if(mouseclicked (on Tile)){
		 l.paint(g);
		 }
		*/
		
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
	}

	
}