package layers;

import java.awt.Color;

public class SolidLayer extends Layer {

	private Color fillColor;

	public SolidLayer(Image img, int x, int y, int width, int height, Color fillColor) {
		super(img, x, y, width, height);
		this.fillColor = fillColor;
	}

	@Override
	public Color getPixel(int i, int j) {
		return this.fillColor;
	}
}
