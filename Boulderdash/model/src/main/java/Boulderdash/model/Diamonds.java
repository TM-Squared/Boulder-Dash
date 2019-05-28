package Boulderdash.model;

import java.awt.Image;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Diamonds {

	int x;
	int y;
	Image diamond;
	
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
	public Image getDiamond() {
		return diamond;
	}
	public void setDiamond(Image diamond) {
		this.diamond = diamond;
	}
		

	
}
