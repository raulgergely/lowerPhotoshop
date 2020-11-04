package filters;

import java.awt.Color;

public class Invert implements Filter {

	public Color apply(Color c) {
		int newRed = 255 - c.getRed();
		int newGreen = 255 - c.getGreen();
		int newBlue = 255 - c.getBlue();
		int newAlpha = c.getAlpha();

		Color newColor = new Color(newRed, newGreen, newBlue, newAlpha);
		return newColor;
	}
}