package championClash;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Simplifies way of loading images and creates new method for process.
 * @author Abhishek Garud, Ethan Bar - 5/24/21
 *
 */
public class ImageLoader {
	
	/**
	 * Method to simplify process of loading images.
	 * @param path Path by which the image needed to be loaded is located.
	 * @return BufferedImage in the path passed in.
	 */
	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
