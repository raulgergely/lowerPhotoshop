package filters;

import java.awt.Color;

public class Contrast implements Filter {
	float adjustments;

	public Contrast(float adjustments) {
		this.adjustments = adjustments;
	}

	@Override
	public Color apply(Color c) {
		float red, green, blue;
		red = c.getRed();
		green = c.getGreen();
		blue = c.getBlue();

		red /= 255f;
		red -= 0.5f;
		red *= adjustments;
		red += 0.5f;
		red *= 255f;
		red = Math.max(0, Math.min(255f, red));

		green /= 255f;
		green -= 0.5f;
		green *= adjustments;
		green += 0.5f;
		green *= 255f;
		green = Math.max(0, Math.min(255f, green));

		blue /= 255f;
		blue -= 0.5f;
		blue *= adjustments;
		blue += 0.5f;
		blue *= 255f;
		blue = Math.max(0, Math.min(255f, blue));
		int r = (int) red;
		int b = (int) blue;
		int g = (int) green;

		return new Color(r, g, b, c.getAlpha());
	}

}
