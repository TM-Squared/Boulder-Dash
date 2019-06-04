package Boulderdash.model;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * @author GROUP 8
 *
 */
public class Rockman  {
	int x;
	int y;
	Image image;
	public static ImoObject[][] imoobjet;
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Rockman(int x, int y) {
		this.x=320;
		this.y=160;
		this.setImage(image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\Dash[1570].png").getImage());
		imoobjet=new ImoObject[22][42];
	}


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


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}
	
	
}
