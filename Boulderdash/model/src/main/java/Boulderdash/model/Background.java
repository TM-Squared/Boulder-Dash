package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Background extends ImoObject {
	int x;
	int y;
	Image image;
	public Background(int x, int y) {
		super();
		this.x=x;
		this.y=y;
		this.image = new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage();
	}
	
}
