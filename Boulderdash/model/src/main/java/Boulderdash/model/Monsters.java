package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Monsters {

	int x;
	int y;
	Image Monster=new ImageIcon("").getImage();
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
	public Image getMonster() {
		return Monster;
	}
	public void setMonster(Image monster) {
		Monster = monster;
	}
	
	
}
