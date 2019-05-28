package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rock {
	int x;
	int y;
	Image rock=new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\roche[1578].png").getImage();
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Image getRock() {
		return rock;
	}
	public void setRock(Image rock) {
		this.rock = rock;
	}
	
	
}

