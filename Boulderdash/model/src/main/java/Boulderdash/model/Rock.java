package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rock extends ImoObject {
	int x;
	int y;
	Image image;
	
	public Rock(int x, int y) {
		super(x,y);
		this.setImage(image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\roche[1578].png").getImage());
	}
	
}

