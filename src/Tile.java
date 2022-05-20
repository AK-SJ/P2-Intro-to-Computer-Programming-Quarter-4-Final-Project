import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Tile {
	
	private Image img;
	private AffineTransform tx;
	private String word;

	
	public Tile(int a, int b, String mystery) {
		
		
		img = getImage("/imgs/Tile.png");
		tx = AffineTransform.getTranslateInstance(a, b);
		init(a, b);
		
		word = mystery;
	
	}
	
	public String getWord() {
		return word;
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		update();
		g2.drawImage(img,  tx, null);
	}
	
	private void update() {
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(7, 7);
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