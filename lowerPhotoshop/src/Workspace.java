import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import layers.Image;
import layers.Layer;

public class Workspace {
	
	private int width;
	private int height;
	private List<Layer> layers;
	BufferedImage img;
	
	public Workspace(int width, int height){
        this.width = width;
        this.height = height;
        this.layers = new ArrayList<>(); // atentie aici
     }
	
	public void addLayer(Layer l){
        this.layers.add(l);
     }
	
	 public void save(Image img,String imagePath) {
	        //Image result = new Image(null, imagePath);
	        for(int i = 0; i < this.layers.size(); i++){ // atentie aici
	          Layer l = this.layers.get(i);
	          l.apply(img);
	        }
	       img.write(imagePath);
	     }
}
