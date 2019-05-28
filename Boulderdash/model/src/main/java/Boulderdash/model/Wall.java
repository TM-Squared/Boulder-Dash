package Boulderdash.model;

import java.awt.Image;

public class Wall extends ImoObject {
	int x;
	int y;
	Image wall;
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
	public Image getWall() {
		return wall;
	}
	public void setWall(Image wall) {
		this.wall = wall;
	}
	
	

}
