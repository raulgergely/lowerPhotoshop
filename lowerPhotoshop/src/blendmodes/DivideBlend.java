package blendmodes;

public class DivideBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		return fa / fb;
	}

}
