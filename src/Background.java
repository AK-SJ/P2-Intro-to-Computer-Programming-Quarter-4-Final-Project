import javax.swing.JFrame;

public class Background { // This class creates the background of the entire game
	
	// Instance Variables:
	
		int x = 0;
	
	public Background () {
		
		JFrame f = new JFrame("Mystery Word Guessing Game & Spelling Bee");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1000,1000);
		//t.start();
		f.setVisible(true);
		
	}

	public int /*Tile*/ getTile () {
		return 5;
	}
	
	
	
	
	
	public static void main(String[] arg) {
		
		Tile t = new Tile();
		
	}
	
	
	
}
