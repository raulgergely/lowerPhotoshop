package layers;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImageLayer extends Layer {
	private Image image;
	BufferedImage img1;

	public ImageLayer(Image img, int x, int y, int w, int h) {
		super(img, x, y, w, h);
		this.image = img;
		img1 = image.bufferedImage();

	}

	public Color getPixel(int i, int j) {
		return new Color(this.img1.getRGB(i, j));
	}

}
