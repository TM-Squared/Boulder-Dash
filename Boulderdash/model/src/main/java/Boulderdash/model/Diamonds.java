package Boulderdash.model;

import java.awt.Graphics;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Diamonds extends ImoObject{

	int x;
	int y;
	Image image;
	public Diamonds(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.image=new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\diam1[1571].png").getImage();
	}
	
	
	
}
