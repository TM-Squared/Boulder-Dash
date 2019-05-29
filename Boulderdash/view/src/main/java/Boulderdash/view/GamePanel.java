package Boulderdash.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

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
	
	Image background=new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage();
	
	static level map=new level(1);
	public static ImoObject[][] imoobjet;
	
	public GamePanel() {	
	imoobjet=new ImoObject[GameFrame.y][GameFrame.x];
	imoobjet=Caract();
	
	}
	
	public static ImoObject[][] Caract() {
		int x=0;
		int y=0;
		ImoObject[][] imoObject= new ImoObject[GameFrame.y][GameFrame.x];
		
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(map.getTableau()[j][i]=='M') {
					imoObject[j][i]= new Wall(x,y);
				}
				if(map.getTableau()[j][i]=='S') {
					imoObject[j][i]= new Ground(x,y);
				}
				if(map.getTableau()[j][i]=='D') {
					imoObject[j][i]= new Diamonds(x,y);
				}
				if(map.getTableau()[j][i]=='R') {
					imoObject[j][i]= new Rock(x,y);
				}
				if(map.getTableau()[j][i]=='-') {
					imoObject[j][i]= new Background(x,y);
				}
				if(map.getTableau()[j][i]=='P') {
					imoObject[j][i]= new Door(x,y);
				}
				
				x+=32;
			}
			x=0;
			y+=32;
		}
		return imoObject;
		
	} 
	

	public void parcourir() {
		
		for(ImoObject tab2[]:imoobjet) {
			for(ImoObject tab1: tab2) {
				System.out.println(tab1);
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		int x=0;
		int y=0;
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				g.drawImage(this.background,x,y,32,32,this);
				x+=32;
			}
			x=0;
			y+=32;
		}
		
		/*int a=0;
		int b=0;
		*/
		
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(imoobjet[j][i]!=null)
				g.drawImage(imoobjet[j][i].getImage(), imoobjet[j][i].getX(), imoobjet[j][i].getY(),32,32,this);
				
				//System.out.println(imoobjet[j][i].getClass().getName());

			}
			
		}
	
	
		repaint();
		
	}
	
}
