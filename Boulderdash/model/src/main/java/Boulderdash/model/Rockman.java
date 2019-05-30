package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rockman extends MobileObject {
	int x;
	int y;
	Image image;
	public static ImoObject[][] imoobjet;
	
	
	public Rockman(int x, int y) {
		super(224, 98);
		this.setImage(image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\Dash[1570].png").getImage());
		imoobjet=new ImoObject[26][55];
	}
	
	
}
