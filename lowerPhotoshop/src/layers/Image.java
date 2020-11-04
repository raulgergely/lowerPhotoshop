package layers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
	BufferedImage image;

	public Image( String path) {
		this.image =null;
		File input = new File(path);

		try {
			this.image = ImageIO.read(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BufferedImage bufferedImage() {
		return image;
	}

	public int getWidth() {
		return image.getWidth();
	}

	public int getHeight() {
		return image.getHeight();
	}

	public void write(String name) {
		File output = new File(name);
		try {
			ImageIO.write(image, "jpg", output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
