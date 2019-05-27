package Boulderdash.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	Image background=new ImageIcon("/model/src/main/java/Images/solnoir[1569].png").getImage(); 
	public GamePanel() {
		
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0,GameFrame.longFen, GameFrame.largFen, this);
		
	}
}
