package blendmodes;

public class MultiplyBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		return fa * fb;
	}
}
