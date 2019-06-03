package Boulderdash.main;

import Boulderdash.model.DAOconnection;
import Boulderdash.view.GameFrame;
import Boulderdash.view.GamePanel;

/**
 * @author GROUP 8
 *EXECUTION OF PROGRAM
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOconnection daoconnection=new DAOconnection();
		daoconnection.open();
		GameFrame gameframe= new GameFrame();
		
	}

}
