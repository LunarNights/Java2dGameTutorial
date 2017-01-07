package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	public String path;
	public int width;
	public int height;
	
	public int[] pixels;
	
	public SpriteSheet(String path){
		BufferedImage image = null;
		try {
			ImageIO.read(SpriteSheet.class.getResourceAsStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(image == null){
			return;
		}
		
		this.path = path;
		this.height = image.getHeight();
		this.width = image.getWidth();
		
		pixels = image.getRGB(0,0,width,height,null,0,width);
		
		for(int i = 0;i<pixels.length;i++){
			pixels[i] = (pixels[i] & 0xff)/64;
		}
	}
	
}
