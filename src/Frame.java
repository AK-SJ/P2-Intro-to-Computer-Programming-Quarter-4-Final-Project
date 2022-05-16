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



public class Frame extends JPanel{

	Tile t = new Tile(200, 200, "hello");
	RandomLetters r = new RandomLetters();
	RandomLetters rl = new RandomLetters(/*array with characters*/);
	// maybe add every letter in the alphabet as pngs and then paint those onto the tile
	
	//JTextField textField = new JTextField();
	//or you can enter default text into the field
	//JTextField textField2 = new JTextField("Enter Name")
	
	
	public Frame() {
		
		JFrame f = new JFrame("Mystery Word Guessing Game & Spelling Bee");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1000,1000);
 		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		
	}
	
	public void paint(Graphics g) { // The objects paint themselves.
		t.paint(g);
	}
	
	public void wordEquals() {
	}
	
	public void printWord() {
		
		System.out.println(t.getWord());
		
	}
	
	public String check() {
		
		return t.foundMysteryWord();
		
	}
	
	
	public static void main(String args[]) {
		
		Frame f = new Frame();
		System.out.println("Updates");
		
		/* if() {
			
			System.out.println("true");
			
		} else {
			
			System.out.println("false);
		
		} */
		
		//let characters = [];

		/* for( let i = 32; i < 127; i++) {
			 	characters.push( String.fromCharCode(i));
		}
		
		*/
		
	}
	
/*	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(){}
	
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
	public void actionPerformed(ActionEvent arg0) { // Performs the 'action [method] of gravity' on HeLava and SheHydro.
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	
		 for(int i = 0; i < characters.length; i++){
		 	
		 	if(arg0.getKeyCode() == i){
		 		System.out.print("characters[i].getChar());
		 	}
		 
		 }
		
	}
	 
	 

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
*/
	
}