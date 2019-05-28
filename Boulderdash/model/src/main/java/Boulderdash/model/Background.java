package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Background extends ImoObject {
	int x;
	int y;
	Image image;
	public Background() {
		super();
		this.image = new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage();
	}
	
}
