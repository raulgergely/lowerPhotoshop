package blendmodes;

public class OverlayBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		return fa * (fa + fb * 2 * (1 - fa));
	}

}
