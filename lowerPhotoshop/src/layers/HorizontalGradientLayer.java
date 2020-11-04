package layers;

import java.awt.Color;

public class HorizontalGradientLayer extends Layer {
	private int width;

	public HorizontalGradientLayer(Image img, int x, int y, int width, int height) {
		super(img, x, y, width, height);
		this.width = width;
	}

	public Color getPixel(int i, int j) {
		float procent = (float) i / this.width; // asa v-om transforma intervalul '0-width) la intervalul (0-1)
		float colorValue = procent * 255f; // asta transformam intervalul 0-1 la intervalul 0-255
		int value = (int) colorValue; // clasa color accepta `int`-uri ca parametri.
		return new Color(value, value, value);
	}
}
