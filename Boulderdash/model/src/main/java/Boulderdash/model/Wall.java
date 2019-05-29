package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends ImoObject {
	int x;
	int y;
	Image image;
	public Wall(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\mur[1577].png").getImage();
	}


}
