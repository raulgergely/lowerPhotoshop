package filters;

import java.awt.Color;

public class Brightness implements Filter {
	int value;

	public Brightness(int value) {
		this.value = value;
	}

	public Color apply(Color c) {
		int newRed = Math.max(0, Math.min(255, c.getRed() + this.value));
		int newGreen = Math.max(0, Math.min(255, c.getGreen() + this.value));
		int newBlue = Math.max(0, Math.min(255, c.getBlue() + this.value));
		return new Color(newRed, newGreen, newBlue, c.getAlpha());

	}

}
