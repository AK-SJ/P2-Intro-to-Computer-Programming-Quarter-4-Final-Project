import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class alphabetLetter {
	
		private char[] alphabet; // Creates new alphabet array with the necessary number of chars.
		private RandomLetter L; // (Is it possible to use the Letter object and make an array of those for the alphabet)
		
		public alphabetLetter() {
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

		public static void main(String[] args) {
			Random random = new Random();
			char randomizedCharacter = (char) (random.nextInt(26) + 'a');
			System.out.println("Generated Random Character: " + randomizedCharacter);
		}
		    
}