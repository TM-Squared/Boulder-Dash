package Boulderdash.main;

import Boulderdash.model.DAOconnection;
import Boulderdash.view.GameFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOconnection daoconnection=new DAOconnection();
		daoconnection.open();
		GameFrame gameframe= new GameFrame();
		
	}

}
