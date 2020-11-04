package filters;

import java.awt.Color;

public class GrayScale implements Filter {

	public Color apply(Color c) {
		int avg = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
		return new Color(avg, avg, avg);
	}
}
