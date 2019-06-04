package Boulderdash.main;

import Boulderdash.model.DAOconnection;
import Boulderdash.model.Music;
import Boulderdash.view.GameFrame;


/**
 * @author GROUP 8
 *EXECUTE PROGRAM
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true;
		DAOconnection daoconnection=new DAOconnection();
		daoconnection.open();
		new GameFrame();
		while(a==true) {
			Music.Play("C:\\Users\\TOUSSI Manoel\\Documents\\Cours\\Semestre2\\Bloc5 Conception et POO -Etudiants\\Projet2\\Myproject\\01-04.wav");
		}
	}

}
