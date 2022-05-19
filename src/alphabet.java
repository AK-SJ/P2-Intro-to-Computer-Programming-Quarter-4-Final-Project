import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class alphabet {
	
		private char[] alphabet; // Creates new alphabet array with the necessary number of chars.
		private Letter L; // (Is it possible to use the Letter object and make an array of those for the alphabet)
		
		public alphabet() {
			// TODO Auto-generated constructor stub
			
			char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			
		}
		
		public char generateRandomChar() {
			
			Random rand = new Random();
			
			int randomChar = rand.nextInt(alphabet.length);
			
			return alphabet[randomChar];
			
		}
		
		public char getChar() {
			
			return generateRandomChar();	
			
		}
		
		public void paint(Graphics g) {
			
		}
		
		public static void main(String[] arg) {	
		}

}