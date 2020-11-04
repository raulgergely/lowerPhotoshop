package filters;

import java.awt.Color;

public class Sepia implements Filter {

	public Color apply(Color c) {
		float red, green, blue, outputRed, outputGreen, outputBlue;
		red = c.getRed() / 255f;
		green = c.getGreen() / 255f;
		blue = c.getBlue() / 255f;
		outputRed = (red * .393f) + (green * .769f) + (blue * .189f);
		outputGreen = (green * .349f) + (green * .686f) + (blue * .168f);
		outputBlue = (blue * .272f) + (green * .534f) + (blue * .131f);

		int nr = (int) Math.max(0, Math.min(255, outputRed * 255f));
		int ng = (int) Math.max(0, Math.min(255, outputGreen * 255f));
		int nb = (int) Math.max(0, Math.min(255, outputBlue * 255f));

		return new Color(nr, nb, ng, c.getAlpha());
	}
}
