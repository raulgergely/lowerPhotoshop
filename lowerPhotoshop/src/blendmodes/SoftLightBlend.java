package blendmodes;

public class SoftLightBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		if (fb > 0.5f)
			return (float) (1 - ((1 - fb) * (1 - (fa - 0.5))));
		else
			return (float) (fb * (fa + 0.5));
	}

}
