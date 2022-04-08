import java.util.Random;

public class RandomLetters {
	
		private char[] alphabet; // Creates new alphabet array with the necessary number of chars.
	
		public RandomLetters (char[] letterArray) {
			
			alphabet = letterArray;
			int size = alphabet.length;
			size = 26;
			
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
			
			// Progress, 4/4/2022: Finish figuring out nextInt (done) and finish generation of random character to be used on tile (done).
			// Progress, 4/5/2022: Figure out how to make generateRandomChar work and edit or create new tile for letter background.
		}
		
		public char getChar() {
			
			return generateRandomChar();	
			
		}
		
		public static void main(String[] arg) {
			
			Tile t = new Tile();
			
		}
		
			
}
