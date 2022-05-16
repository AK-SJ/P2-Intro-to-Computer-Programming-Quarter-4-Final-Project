import java.awt.Graphics;

	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.geom.AffineTransform;
	import java.net.URL;
    import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

	public class Background {
		
		public int ulx, uly; // The 1st, 2nd, 4th, 6th, and 7th lines are all new variable declarations / instantiations to help with some of the more complicated bits of the
		// code [read Frame to learn more]. The 1st and 2nd are for the boundaries of the game's frame (so HeLava and SheHydro don't go flying off the screen). Lines 4 and 6
		// have been edited and/or made in order to deal with the color coordination. The last line is to help deal with the sizing issues we ran into.
		public int lrx, lry;
		private Image img; 	
		private BufferedImage bimg = null;
		private AffineTransform tx;
		private String bg_png_path = "/imgs/BackgroundForGame.png";
		private int scale = 6;
		
	    public int color_light_green = -11751600; // RGB for light green
	    public int color_dark_green = -13730510;  // RGB for dark green
	    
	    // Color recognition to help with something discussed in Frame.
		
		public Background(int x, int y) {
			img = getImage(bg_png_path); // All of these lines, excluding the last two, are either modified or completely new, 'constructed' to help with the 'reading' of the 
			// background image.
			bimg = getBufferedImage(bg_png_path);
			this.ulx = x;
			this.uly = y;
	        this.lrx = ulx + bimg.getWidth(null) * scale;
	        this.lry = uly + bimg.getHeight(null) * scale;
			tx = AffineTransform.getTranslateInstance(x, y);
			init(x, y); 				//initialize the location of the image; use your variables
		}
		
		public void changePicture(String newFileName) { // Swapped up a bit for the scan of the background visual.
			img = getImage(newFileName);
			bimg = getBufferedImage(newFileName);
	        this.lrx = ulx + img.getWidth(null) * scale;
	        this.lry = uly + img.getHeight(null) * scale;
			init(ulx, uly);
		}
		
		public BufferedImage getBufferedImage() { // New Method to return the buffered image.
		    return bimg;
		}
		
		private BufferedImage getBufferedImage(String fileName) {
			if(bimg != null)
				return bimg;
			try {
  		      return ImageIO.read(Background.class.getResource(fileName)); 
			} catch(Exception e) {
		      return new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
			}
		}
		
		public void paint(Graphics g) {
			
			//these are the 2 lines of code needed draw an image on the screen.
			Graphics2D g2 = (Graphics2D) g;
			
			//call update to update the actual picture location
			
			update();
			g2.drawImage(img, tx, null);
		}
		
		/* update the picture variable location */
		
		private void update() { // Usage of the transformed variables.
			tx.setToTranslation(ulx, uly);
			tx.scale(scale, scale);
		}
		
		private void init(double a, double b) {
			tx.setToTranslation(a, b);
			tx.scale(.5, .5);
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