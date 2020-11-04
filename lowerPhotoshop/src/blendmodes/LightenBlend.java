package blendmodes;

public class LightenBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		if (fa > fb)
			return fa;
		return fb;
	}

}
