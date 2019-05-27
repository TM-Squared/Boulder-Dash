package Boulderdash.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	public static int longFen=2400;
	public static int largFen=896;
	
	public GameFrame() {
		GamePanel gamepanel=new GamePanel();
		this.setTitle("Boulder Dash");
		this.setSize(longFen, largFen);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(gamepanel);
		this.setVisible(true);
	}
	
}
