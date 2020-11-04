package filters;

import java.awt.Color;

public class Colorize implements Filter {
	int level;
	Color input;

	public Colorize(Color input, int level) {
		this.input = input;
		this.level = level;
	}

	public Color apply(Color c) {
		float red, green, blue;
		red = (c.getRed() + input.getRed()) / 255f * (level / 100f);
		red = Math.max(0, Math.min(255, red));

		green = (c.getGreen() - input.getGreen());
		green = Math.max(0, Math.min(255, green));

		blue = (c.getBlue() - input.getBlue());
		blue = Math.max(0, Math.min(255, blue));

		int r = (int) red;
		int b = (int) blue;
		int g = (int) green;

		return new Color(r, g, b, c.getAlpha());
	}

}
