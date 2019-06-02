package Boulderdash.model;

public class level {
	private char [][] tableau;
	
	
	public level(int lvl) {
		DAOconnection daoconnection=new DAOconnection();
		this.tableau=daoconnection.parniveau(lvl);
	}


	public char[][] getTableau() {
		return tableau;
	}
	
	
	
}
