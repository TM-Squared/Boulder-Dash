package Boulderdash.controller;

import Boulderdash.model.Background;

import Boulderdash.model.Diamonds;
import Boulderdash.model.Ground;
import Boulderdash.model.Rockman;


public class Collision {
	
	
	/**
	 * ALLOW ROCKMAN TO DIG
	 */
	public void dig() {
		for(int j=0; j<22; j++) {
			for(int i=0; i<42; i++) {
				if(Rockman.imoobjet[j][i]!=null) {
					if(Rockman.imoobjet[j][i].getClass().toString().equals(new Ground(0,0).getClass().toString())) {
						if(Rockman.imoobjet[j][i].getX()==KeyBoard.rockman.getX() && Rockman.imoobjet[j][i].getY()==KeyBoard.rockman.getY()) {					
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
	
	/**
	 * COLLECT DIAMONDS
	 */
	public void collectDiamonds() {
		for(int j=0; j<22; j++) {
			for(int i=0; i<42; i++) {
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
							break;
						}
					}
				}
			}
		}
	}
	
	
}
