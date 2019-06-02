package Boulderdash.view;

import java.util.Scanner;

public class LevelManagement {
	static Scanner sc=new Scanner(System.in);
	/*
	 * CHANGE LEVEL
	 */
	public static int  ChangeLevel() {
		System.out.println("Choississez un niveau entre 1 et 5");
		GamePanel.lvl=sc.nextInt();
		while(GamePanel.lvl>5 && GamePanel.lvl<1) {
			System.out.println("Choississez un niveau entre 1 et 5");
			GamePanel.lvl=sc.nextInt();
	
		}
		return GamePanel.lvl;
	}
	
	
}
