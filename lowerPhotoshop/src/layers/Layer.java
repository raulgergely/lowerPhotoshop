package layers;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;

import blendmodes.BlendMode;
import blendmodes.SimpleBlend;
import filters.Filter;

public abstract class Layer {
	private int x, y, width, height,transparency;
	BufferedImage image;
	private Filter filter;
	private BlendMode blendMode;

	public Layer(Image img, int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.image = img.bufferedImage();
		this.blendMode = new SimpleBlend();
		this.transparency=100;
	}

	public void apply(Image img) {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (inBounds(i + x, j + y, img.getWidth(), img.getHeight())) {

					Color pixelWithFilter = applyFilter(this.getPixel(i, j));
					pixelWithFilter=new Color(pixelWithFilter.getRed(), pixelWithFilter.getGreen(), pixelWithFilter.getBlue());
					Color pixelWithBlend = applyBlend(new Color(image.getRGB(i + x, j + y), true), pixelWithFilter);
					pixelWithBlend=new Color(pixelWithBlend.getRed(), pixelWithBlend.getGreen(), pixelWithBlend.getBlue());
					image.setRGB(i + x, j + y, pixelWithBlend.getRGB());
			
				}
			}
		}
		//System.out.println(image.getTransparency());
	}

	private boolean inBounds(int i, int j, int width, int height) {
		if (i < 0 || i >= width) {
			return false;
		}
		if (j < 0 || j >= height) {
			return false;
		}
		return true;
	}

	private Color applyFilter(Color c) {
		if (this.filter != null) {
			return this.filter.apply(c);
		}
		return c;
	}

	public void setFilter(Filter f) {
		this.filter = f;
	}

	public void setBlendMode(BlendMode b) {
		this.blendMode = b;
	}
	public void setTransparency(int t) {
		this.transparency = t;
	}

	private Color applyBlend(Color oldColor, Color newColor) {
		return this.blendMode.apply(oldColor, newColor);
	}

	public abstract Color getPixel(int i, int j);
}
