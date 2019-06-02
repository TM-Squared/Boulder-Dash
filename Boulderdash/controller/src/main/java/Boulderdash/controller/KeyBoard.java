package Boulderdash.controller;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Boulderdash.model.Background;
import Boulderdash.model.Diamonds;
import Boulderdash.model.Ground;
import Boulderdash.model.Rockman;
import Boulderdash.model.Wall;

public class KeyBoard implements KeyListener  {
	static Rockman rockman=new Rockman(224,98);
	static boolean up=true;
	static boolean down=true;
	static boolean right=true;
	static boolean left=true;
	Collision collision=new Collision();
	
	public static Rockman getRockman() {
		return rockman;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * HUMAN INTERFACE MACHINE*/

	@Override
	public void keyPressed(KeyEvent e) {
		collision.dig();
		collision.collectDiamonds();
		//collision.moveCollision();
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(KeyBoard.left==true) {
				rockman.setX(rockman.getX()-32);
			}
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			 if(KeyBoard.right==true) {
				rockman.setX(rockman.getX()+32);
			}
			 
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(KeyBoard.up==true) {
			rockman.setY(rockman.getY()-32);
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(KeyBoard.down==true) {
				rockman.setY(rockman.getY()+32);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

		
}
