package blendmodes;

public class SubtractBlend extends AbstractBlend implements BlendMode  {
		
		 public float calculateBlend(float fa,float fb) {
		    	return  fa - fb;
		    }
}
