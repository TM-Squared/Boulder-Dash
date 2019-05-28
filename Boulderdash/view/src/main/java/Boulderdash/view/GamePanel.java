package Boulderdash.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Ground;
import Boulderdash.model.ImoObject;
import Boulderdash.model.Monsters;
import Boulderdash.model.Rock;
import Boulderdash.model.Rockman;
import Boulderdash.model.Wall;
import Boulderdash.model.level;

public class GamePanel extends JPanel{
	
	Image background=new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage(); 
	static level map=new level(1);
	Wall wall=new Wall();
	Diamonds diamond=new Diamonds();
	Rockman rockman=new Rockman();
	Ground ground= new Ground();
	Monsters monster=new Monsters();
	Rock rock=new Rock();
	public static ImoObject[][] imoobjet;
	
	public GamePanel() {
		wall.setWall(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\mur[1577].png").getImage());
		rockman.setRockman(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\Dash[1570].png").getImage());
		diamond.setDiamond(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\diam1[1571].png").getImage());
		ground.setGround(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\sol[1579].png").getImage());
		monster.setMonster(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\monster.png").getImage());
		rock.setRock(new ImageIcon("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\roche[1578].png").getImage());
	imoobjet=new ImoObject[28][75];
	imoobjet=Caract();
	
	}
	
	public static ImoObject[][] Caract() {
		int x=0;
		int y=0;
		ImoObject[][] imoObject= new ImoObject[28][75];
		
		for(int j=0; j<28; j++) {
			for(int i=0; i<75; i++) {
				if(map.getTableau()[j][i]=='M') {
					imoObject[j][i]= new Wall();
				}
				if(map.getTableau()[j][i]=='5') {
					imoObject[j][i]= new Ground();
				}
				if(map.getTableau()[j][i]=='D') {
					imoObject[j][i]= new Diamonds();
				}
				if(map.getTableau()[j][i]=='M') {
					imoObject[j][i]= new Rock();
				}
				if(map.getTableau()[j][i]=='-') {
					imoObject[j][i]= new Background();
				}
				
				x+=32;
			}
			x=0;
			y+=32;
		}
		return imoObject;
		
	}
	
	public void paintComponent(Graphics g) {
		int x=0;
		int y=0;
		for(int j=0; j<28; j++) {
			for(int i=0; i<75; i++) {
				g.drawImage(this.background,x,y,32,32,this);
				x+=32;
			}
			x=0;
			y+=32;
		}
		
		int a=0;
		int b=0;
		
		
		
		repaint();
		
	}
}
