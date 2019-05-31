package Boulderdash.controller;

import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Ground;
import Boulderdash.model.Rockman;
import Boulderdash.model.Wall;

public class Collision {
	//KeyBoard keyboard=new KeyBoard();
	
	public void direction() {
		if(KeyBoard.up==true) {
			KeyBoard.setUp(false);
			KeyBoard.setRight(true);
			KeyBoard.setDown(true);
			KeyBoard.setLeft(true);
		}
		else if(KeyBoard.down=true) {
			KeyBoard.setUp(true);
			KeyBoard.setRight(true);
			KeyBoard.setDown(false);
			KeyBoard.setLeft(true);
		}
		else if(KeyBoard.left=true) {
			KeyBoard.setUp(true);
			KeyBoard.setRight(true);
			KeyBoard.setDown(true);
			KeyBoard.setLeft(false);
		}
		else if(KeyBoard.right=true) {
			KeyBoard.setUp(true);
			KeyBoard.setRight(false);
			KeyBoard.setDown(true);
			KeyBoard.setLeft(true);
		}
	}
	public void dig() {
		for(int j=0; j<26; j++) {
			for(int i=0; i<55; i++) {
				//System.out.println(Rockman.imoobjet[j][i]);
				//System.out.println(j);
				if(Rockman.imoobjet[j][i]!=null) {
					if(Rockman.imoobjet[j][i].getClass().toString().equals(new Ground(0,0).getClass().toString())) {
						if(Rockman.imoobjet[j][i].getX()==KeyBoard.rockman.getX() && Rockman.imoobjet[j][i].getY()==KeyBoard.rockman.getY()) {
							
							int a=Rockman.imoobjet[j][i].getX();
							int b=Rockman.imoobjet[j][i].getY();
							Rockman.imoobjet[j][i]=new Background(0,0);
							Rockman.imoobjet[j][i].setX(a);
							Rockman.imoobjet[j][i].setY(b);
							System.out.println(j);
							System.out.println(i);
							
							System.out.println(KeyBoard.rockman.getX());
							System.out.println(KeyBoard.rockman.getY());
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
						if(Rockman.imoobjet[j][i].getX()==KeyBoard.rockman.getX() && Rockman.imoobjet[j][i].getY()==KeyBoard.rockman.getY()) {
							
							int a=Rockman.imoobjet[j][i].getX();
							int b=Rockman.imoobjet[j][i].getY();
							Rockman.imoobjet[j][i]=new Background(0,0);
							Rockman.imoobjet[j][i].setX(a);
							Rockman.imoobjet[j][i].setY(b);
							System.out.println(KeyBoard.rockman.getX());
							System.out.println(KeyBoard.rockman.getY());
							break;
						}
					}
				}
			}
		}
	}
	
	public void moveCollision() {
		for(int j=0; j<26; j++) {
			for(int i=0; i<55; i++) {
				//System.out.println(Rockman.imoobjet[j][i]);
				//System.out.println(j);
				if(Rockman.imoobjet[j][i]!=null) {
					if(Rockman.imoobjet[j][i].getClass().toString().equals(new Wall(0,0).getClass().toString())) {
						if(Rockman.imoobjet[j][i].getX()==KeyBoard.rockman.getX() && Rockman.imoobjet[j][i].getY()==KeyBoard.rockman.getY()) {
							direction();
							System.out.println(KeyBoard.rockman.getX());
							System.out.println(KeyBoard.rockman.getY());
							
						}
					}
				}
			}
		}
		
	}
	
}
