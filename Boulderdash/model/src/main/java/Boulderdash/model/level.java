package Boulderdash.model;

public class level {
	char [][] tableau;
	
	
	public level(int lvl) {
		DAOconnection daoconnection=new DAOconnection();
		tableau=daoconnection.parniveau(lvl);
	}
}
