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

	@Override
	public void keyPressed(KeyEvent e) {
		collision.dig();
		collision.collectDiamonds();
		collision.moveCollision();
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

	public static boolean isUp() {
		return up;
	}

	public static void setUp(boolean up) {
		KeyBoard.up = up;
	}

	public static boolean isDown() {
		return down;
	}

	public static void setDown(boolean down) {
		KeyBoard.down = down;
	}

	public static boolean isRight() {
		return right;
	}

	public static void setRight(boolean right) {
		KeyBoard.right = right;
	}

	public static boolean isLeft() {
		return left;
	}

	public static void setLeft(boolean left) {
		KeyBoard.left = left;
	}
	
}
