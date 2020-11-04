package layers;

import java.awt.Color;

public class VerticalGradientLayer extends Layer {
	private int height;

	public VerticalGradientLayer(Image img, int x, int y, int width, int height) {
		super(img, x, y, width, height);
		this.height = height;
	}

	@Override
	public Color getPixel(int i, int j) {
		float procent = (float) j / this.height;
		float colorValue = procent * 255f;
		int value = (int) colorValue;
		return new Color(value, value, value);
	}
}
