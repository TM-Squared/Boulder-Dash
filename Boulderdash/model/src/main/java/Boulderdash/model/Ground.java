 package Boulderdash.model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Ground extends ImoObject{
	int x;
	int y;
	Image ground;
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
	public Image getGround() {
		return ground;
	}
	public void setGround(Image ground) {
		this.ground = ground;
	}

	
	
}


















