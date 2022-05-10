import java.awt.Graphics;
import java.util.Random;

public class RandomLetters {
	
		private char[] alphabet; // Creates new alphabet array with the necessary number of chars.
	
		public RandomLetters (char[] letterArray) {
			
			alphabet = letterArray;
			int size = alphabet.length;
			size = 26;
			
		}
		
		public RandomLetters() {
			// TODO Auto-generated constructor stub
		}

		public void fillAlphabet() {
			
			for(char l = 'a'; l <= 'z'; l++) { // Fills alphabet with the letters via a for-loop
				alphabet[l] = l;
			}
			
			System.out.print(alphabet); // Output
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

		// Progress, 4/4/2022: Finish figuring out nextInt (done) and finish generation of random character to be used on tile (done).
		// Progress, 4/5/2022: Figure out how to make generateRandomChar work and edit or create new tile for letter background.
		
}