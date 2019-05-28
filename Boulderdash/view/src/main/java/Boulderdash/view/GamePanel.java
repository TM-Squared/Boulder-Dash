package Boulderdash.view;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	Image background=new ImageIcon("C:\\Users\\TOUSSI Manoel\\git\\Boulder-Dash\\Boulderdash\\view\\Images\\solnoir[1569].png").getImage(); 
	
	
	public GamePanel() {
		
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
		
		repaint();
		
	}
}
