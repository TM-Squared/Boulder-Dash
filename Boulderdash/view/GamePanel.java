package Boulderdash.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


import Boulderdash.controller.KeyBoard;
import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Door;
import Boulderdash.model.Ground;
import Boulderdash.model.ImoObject;
import Boulderdash.model.Monsters;
import Boulderdash.model.Rock;
import Boulderdash.model.Rockman;
import Boulderdash.model.Wall;
import Boulderdash.model.level;

public class GamePanel extends JPanel{
	Background background=new Background(0,0);
	//Image background=new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage();

	KeyBoard keyboard=new KeyBoard();
	static level map=new level(1);
	
	
	
	public GamePanel() {	
	
	Caract();
	}
	
	public void Caract() {
		int x=0;
		int y=0;
		//ImoObject[][] imoObject= new ImoObject[GameFrame.y][GameFrame.x];
		
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(map.getTableau()[j][i]=='M') {
					Rockman.imoobjet[j][i]= new Wall(x,y);
				}
				if(map.getTableau()[j][i]=='S') {
					Rockman.imoobjet[j][i]= new Ground(x,y);
				}
				if(map.getTableau()[j][i]=='D') {
					Rockman.imoobjet[j][i]= new Diamonds(x,y);
				}
				if(map.getTableau()[j][i]=='R') {
					Rockman.imoobjet[j][i]= new Rock(x,y);
				}
				if(map.getTableau()[j][i]=='-') {
					Rockman.imoobjet[j][i]= new Background(x,y);
				}
				if(map.getTableau()[j][i]=='P') {
					Rockman.imoobjet[j][i]= new Door(x,y);
				}
				
				x+=32;
			}
			x=0;
			y+=32;
		}

		
	} 
	
/*
	public void parcourir() {
		
		for(ImoObject tab2[]:imoobjet) {
			for(ImoObject tab1: tab2) {
				System.out.println(tab1);
			}
		}
	}
	*/
	public void paintComponent(Graphics g) {
		int x=0;
		int y=0;
		//DESSINE L'ARRIERE PLAN
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				g.drawImage(background.getImage(),x,y,32,32,this);
				x+=32;
			}
			x=0;
			y+=32;
		}
		
		/*int a=0;
		int b=0;
		*/
		//DESSINE LA CARTEZ
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(Rockman.imoobjet[j][i]!=null)
				g.drawImage(Rockman.imoobjet[j][i].getImage(), Rockman.imoobjet[j][i].getX(), Rockman.imoobjet[j][i].getY(),32,32,this);				
			}
		}
		
		
			g.drawImage(keyboard.getRockman().getImage(),keyboard.getRockman().getX(),keyboard.getRockman().getY(),32,32, this);
			//g.drawImage(background.getImage(),collision.getTab()[0], collision.getTab()[1],32, 32, this);
		repaint();
		
	}
	
}
