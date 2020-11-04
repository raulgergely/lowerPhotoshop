package blendmodes;

import java.awt.Color;

public class SimpleBlend implements BlendMode {

	public Color apply(Color a, Color b) {
		return b;
	}

}
