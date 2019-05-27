 package Boulderdash.model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Gradin {
	
	 
	 int x,y;
	  private Image gradin;



public Gradin() {
	
this.x=x;
this.y=y;

gradin = (new ImageIcon("model/src/main/java/Images/ground.png")).getImage();
	
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



public Image getGradin() {
	return gradin;
}





}












/*public void SaveTab() 

{
	String ligne;
       
 
        try {
            FileReader fichier = new FileReader("model/src/main/java/Images/niveau1");
            Scanner sc = new Scanner(fichier);
 
            while (sc.hasNextLine()) {
                ligne = sc.nextLine();
                gradin.add(ligne.split("\t"));
            }
 
        } catch (FileNotFoundException e) {
            System.out.println("Impossible d'ouvrir le fichier " + "model/src/main/java/Images/niveau1");
        }
         
        
    }
*/






