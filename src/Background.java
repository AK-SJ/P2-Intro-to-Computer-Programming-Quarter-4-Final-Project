import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Background {
	
	// Add location attributes
	int x = 0, y = 0;
	
	private Image img; 	
	private AffineTransform tx;

	public Background(int x, int y) {
		img = getImage("/imgs/Background.png");
		tx = AffineTransform.getTranslateInstance(x, y);
		init(x, y); 				// Initialize the location of the image, use your images
	}

	public void paint(Graphics g) {
		// These are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		// Call update to update the actual picture location
		update();
		// Original background: first level
		g2.drawImage(img, tx, null);
	}
	
	/* Update the picture variable location */
	private void update() {
		tx.setToTranslation(x,y);

	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
//		tx.scale(5, 5);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Background.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	 
}