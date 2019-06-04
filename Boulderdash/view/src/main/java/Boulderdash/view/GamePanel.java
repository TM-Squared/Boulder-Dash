package Boulderdash.view;

import java.awt.Graphics;

import javax.swing.JPanel;


import Boulderdash.controller.KeyBoard;
import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Door;
import Boulderdash.model.Ground;
import Boulderdash.model.Monsters;
import Boulderdash.model.Rock;
import Boulderdash.model.Rockman;
import Boulderdash.model.Wall;
import Boulderdash.model.level;


/**
 * @author GROUP 8
 *
 */
public class GamePanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Background background=new Background(0,0);
	static int lvl=LevelManagement.ChangeLevel();
	KeyBoard keyboard=new KeyBoard();
	static level map=new level(lvl);

	
	public GamePanel() {	
		Caract();		
	}
	
	/**
	 *ASSIGN EACH LETTER TO COMPONENTS 
	 */
	public void Caract() {
		int x=0;
		int y=0;
		
		
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(map.getTableau()[j][i]=='M' || map.getTableau()[j][i]=='W') {
					Rockman.imoobjet[j][i]= new Wall(x,y);
				}
				if(map.getTableau()[j][i]=='S'|| map.getTableau()[j][i]=='5' || map.getTableau()[j][i]=='G') {
					Rockman.imoobjet[j][i]= new Ground(x,y);
				}
				if(map.getTableau()[j][i]=='D' || map.getTableau()[j][i]=='O') {
					Rockman.imoobjet[j][i]= new Diamonds(x,y);
				}
				if(map.getTableau()[j][i]=='R' || map.getTableau()[j][i]=='B' || map.getTableau()[j][i]=='*') {
					Rockman.imoobjet[j][i]= new Rock(x,y);
				}
				if(map.getTableau()[j][i]=='-' || map.getTableau()[j][i]==' ') {
					Rockman.imoobjet[j][i]= new Background(x,y);
				}
				if(map.getTableau()[j][i]=='T') {
					Rockman.imoobjet[j][i]= new Door(x,y);
				}
				if(map.getTableau()[j][i]=='F') {
					Rockman.imoobjet[j][i]= new Monsters(x,y);
				}
				x+=32;
			}
			x=0;
			y+=32;
		}

		
	} 
	
	
	/**
	 *DRAW COMPONENTS
	 */
	public void paintComponent(Graphics g) {
		int x=0;
		int y=0;
		//DRAW THE BACKGROUND
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				g.drawImage(background.getImage(),x,y,32,32,this);
				x+=32;
			}
			x=0;
			y+=32;
		}


		//DRAW THE MAP
		for(int j=0; j<GameFrame.y; j++) {
			for(int i=0; i<GameFrame.x; i++) {
				if(Rockman.imoobjet[j][i]!=null)
				g.drawImage(Rockman.imoobjet[j][i].getImage(), Rockman.imoobjet[j][i].getX(), Rockman.imoobjet[j][i].getY(),32,32,this);				
			}
		}
			g.drawImage(KeyBoard.getRockman().getImage(),KeyBoard.getRockman().getX(),KeyBoard.getRockman().getY(),32,32, this);
		repaint();
		
	}
	
}
