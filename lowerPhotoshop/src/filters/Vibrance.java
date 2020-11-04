package filters;

import java.awt.Color;

public class Vibrance implements Filter {
	float adjustemnts;

	public Vibrance(float adjustments) {
		/* valoare intre -100 si 100 */
		this.adjustemnts = adjustments;
	}

	public Color apply(Color c) {
		float m, avg, amount;
		m = Math.max(c.getRed(), Math.max(c.getGreen(), c.getBlue()));
		avg = (c.getRed() + c.getBlue() + c.getGreen()) / 3f;
		amount = ((Math.abs(m - avg) * 2) / 255) * -adjustemnts / 100f;
		float red = c.getRed();
		float green = c.getGreen();
		float blue = c.getBlue();
		if (red != m) {
			red += (m - red) * amount;
		}
		if (blue != m) {
			blue += (m - blue) * amount;
		}
		if (green != m) {
			green += (m - green) * amount;
		}
		red = Math.max(0, Math.min(255, red));
		green = Math.max(0, Math.min(255, green));
		blue = Math.max(0, Math.min(255, blue));
		int r = (int) red;
		int b = (int) blue;
		int g = (int) green;

		return new Color(r, g, b, c.getAlpha());
	}

}