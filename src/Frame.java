import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame {

	Tile t = new Tile();
	RandomLetters r = new RandomLetters();
	
	public Frame() {
		
		JFrame f = new JFrame("Mystery Word Guessing Game & Spelling Bee");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1000,1000);
 		f.getContentPane().setBackground(Color.cyan);
		//t.start();
 		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
	}
	
	
	
	public void paint(Graphics g) { // The objects paint themselves.
		t.paint(g);
	}
	
	public static void main(String args[]) {
		
		Frame f = new Frame();
		System.out.println("Updates");
		
		/* if() {
			System.out.println("Update Things in the Console");
			
		} */
		
	}
	
/*	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		if(){
			
		}
		
	
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
	
*/
	
}

