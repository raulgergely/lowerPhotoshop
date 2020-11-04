package blendmodes;

public class DarkenBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		if (fa > fb)
			return fb;
		return fa;
	}

}
