package blendmodes;

import java.awt.Color;

public abstract class AbstractBlend {
	public Color apply(Color a, Color b) {
		return new Color(blend(a.getRed(), b.getRed()), blend(a.getGreen(), b.getGreen()),
				blend(a.getBlue(), b.getBlue()), alphaBlend(a.getAlpha(), b.getAlpha()));
	}

	private int blend(int a, int b) {
		float fa = a / 255f; // convert values from 0-255 to 0-1
		float fb = b / 255f;
		float result = calculateBlend(fa, fb);//calculate  blend
			//  result need to have value in [0,1]
		if (result > 1) {
			result = 1;
		}
		if (result < 0) {
			result = 0;
		}

		//reconvert values from 0-1 to 0-255
		return (int) (result * 255);
	}

	private int alphaBlend(int a, int b) {
		float fa = a / 255f;
		float fb = b / 255f;
		float result = fa + fb * (1 - fa); 
		if (result > 1) {
			result = 1;
		}
		if (result < 0) {
			result = 0;
		}
		return (int) (result * 255);
	}

	public abstract float calculateBlend(float fa, float fb);
}
