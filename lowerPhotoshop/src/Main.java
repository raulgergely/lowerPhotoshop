
import java.awt.Color;
import java.awt.image.BufferedImage;

import blendmodes.MultiplyBlend;
import blendmodes.SoftLightBlend;
import filters.GrayScale;
import filters.Invert;
import layers.Image;
import layers.ImageLayer;
import layers.Layer;
import layers.SolidLayer;

public class Main {

	public static void main(String[] args) {
		Image img = new Image( "D:\\Workspace Eclipse\\lowerPhotoshop\\base.jpg");
		Image img2 = new Image( "D:\\Workspace Eclipse\\lowerPhotoshop\\blend_base2.jpg");
		
		Workspace ws = new Workspace(img.getWidth(), img.getHeight());
		/*Layer l = new ImageLayer(img, 0, 0, img.getWidth(), img.getHeight());
		l.setFilter(new GrayScale());
		ws.addLayer(l);*/

		Layer redOverlay = new SolidLayer(img, 0, 0, img.getWidth(), img.getHeight(), Color.RED);
		redOverlay.setBlendMode(new MultiplyBlend());
		redOverlay.setTransparency(25);
		ws.addLayer(redOverlay);
		/*Layer l2 = new ImageLayer(img, 0, 0, img.getWidth(), img.getHeight());
		l2.setFilter(new Invert());
		l2.setBlendMode(new SoftLightBlend());
		ws.addLayer(l2);*/

		ws.save(img, "name.jpg");
	}

}
