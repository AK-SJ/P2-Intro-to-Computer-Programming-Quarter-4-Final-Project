import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Tile {
	
	public int x = 0, y = 0;
	private Image img;
	private AffineTransform tx;
	int dx = 0;
	int dy = 3;
	private String word;

	
	public Tile(int a, int b, String mystery) {
		
		x = a;
		y = b;
		img = getImage("/imgs/S2P2Q4FinalGameSpellingBeeLetterTile.png");
		
		tx = AffineTransform.getTranslateInstance(x, y);
		init(a, b);
		
		dx = x;
		dy = y;
		
		word = mystery;
	
	}
	
	public String getWord() {
		return word;
	}
	
	public void changePicture(String newFileName) {
		img = getImage(newFileName);
		init(x, y);
	}
	
	
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		update();
		g2.drawImage(img,  tx,  null);
	
	}
	
	public String foundMysteryWord() {
		return "You Found the Mystery Word! Good job! :)";
	}
	
	private void update() {
		tx.setToTranslation(x, y);
		tx.scale(1.65, 1.65);
	}
	
	private void init(int a, int b) {
		tx.setToTranslation(a, b);
		tx.scale(.5, .5);
	}
	
	private Image getImage (String path) {
		Image tempImage = null;
		try {
			URL imageURL = Tile.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
		
}