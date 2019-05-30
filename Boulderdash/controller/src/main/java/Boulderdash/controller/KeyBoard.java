package Boulderdash.controller;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Ground;
import Boulderdash.model.Rockman;

public class KeyBoard implements KeyListener  {
	static Rockman rockman=new Rockman(0,0);
	
	public static Rockman getRockman() {
		return rockman;
	}

	public void dig() {
		for(int j=0; j<26; j++) {
			for(int i=0; i<55; i++) {
				//System.out.println(Rockman.imoobjet[j][i]);
				//System.out.println(j);
				if(Rockman.imoobjet[j][i]!=null) {
					if(Rockman.imoobjet[j][i].getClass().toString().equals(new Ground(0,0).getClass().toString())) {
						if(Rockman.imoobjet[j][i].getX()==rockman.getX() && Rockman.imoobjet[j][i].getY()==rockman.getY()) {
							
							int a=Rockman.imoobjet[j][i].getX();
							int b=Rockman.imoobjet[j][i].getY();
							Rockman.imoobjet[j][i]=new Background(0,0);
							Rockman.imoobjet[j][i].setX(a);
							Rockman.imoobjet[j][i].setY(b);
							
							
							//System.out.println(rockman.getX());
							//System.out.println(rockman.getY());
							break;
						}
					}
				}
				
			}
		}
	}
	
	public void collectDiamonds() {
		for(int j=0; j<26; j++) {
			for(int i=0; i<55; i++) {
				//System.out.println(Rockman.imoobjet[j][i]);
				//System.out.println(j);
				if(Rockman.imoobjet[j][i]!=null) {
					if(Rockman.imoobjet[j][i].getClass().toString().equals(new Diamonds(0,0).getClass().toString())) {
						if(Rockman.imoobjet[j][i].getX()==rockman.getX() && Rockman.imoobjet[j][i].getY()==rockman.getY()) {
							
							int a=Rockman.imoobjet[j][i].getX();
							int b=Rockman.imoobjet[j][i].getY();
							Rockman.imoobjet[j][i]=new Background(0,0);
							Rockman.imoobjet[j][i].setX(a);
							Rockman.imoobjet[j][i].setY(b);
							
							break;
						}
					}
				}
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		dig();
		collectDiamonds();
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
			rockman.setX(rockman.getX()-32);
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			rockman.setX(rockman.getX()+32);
		else if(e.getKeyCode()==KeyEvent.VK_UP)
			rockman.setY(rockman.getY()-32);
		else if(e.getKeyCode()==KeyEvent.VK_DOWN)
			rockman.setY(rockman.getY()+32);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
