package Boulderdash.model;

/**
 * @author GROUP 8
 *
 */
public class level {
	private char [][] tableau;
	
	
	/**
	 * @param lvl
	 */
	public level(int lvl) {
		DAOconnection daoconnection=new DAOconnection();
		this.tableau=daoconnection.parniveau(lvl);
	}


	/**
	 * @return TABLEAU
	 */
	public char[][] getTableau() {
		return tableau;
	}
	
	
	
}
