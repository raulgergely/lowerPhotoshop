package blendmodes;

public class AddBlend extends AbstractBlend implements BlendMode {

	public float calculateBlend(float fa, float fb) {
		return fa + fb;
	}

}
