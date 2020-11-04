package filters;

import java.awt.Color;

public class Saturation implements Filter {
	float adjustemnts;

	public Saturation(float adjustments) {
		/* valoare intre -1 si 1 */
		this.adjustemnts = adjustments;
	}

	@Override
	public Color apply(Color c) {
		float m;
		m = Math.max(c.getRed(), Math.max(c.getBlue(), c.getGreen()));
		float red = c.getRed();
		float green = c.getGreen();
		float blue = c.getBlue();
		if (red != m) {
			red += (m - red) * adjustemnts;
		}
		if (blue != m) {
			blue += (m - blue) * adjustemnts;
		}
		if (green != m) {
			green += (m - green) * adjustemnts;
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
