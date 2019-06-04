package Boulderdash.model;

import java.sql.CallableStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author GROUP 8
 *
 */
public class DAOconnection {
	static String URL="jdbc:mysql://localhost/jpublankproject?autoReconnect=true&useSSL=false";
	static String LOGIN="root";
	static String PASSWORD="";
	private java.sql.Connection connection;
	public final int x=42;
	public final int y=22;
	
	/**
	 * THIS IS A CONSTRUCTOR
	 */
	public DAOconnection() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * @return true
	 */
	public boolean open() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection=DriverManager.getConnection(URL,LOGIN, PASSWORD);
			this.connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("echec de la connection");
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("échec de la connection");
			e.printStackTrace();
		}
		
		System.out.println("Bien connecté");
		return true;
	}
	
	/**
	 * @param lvl
	 * @return char [][] tab
	 */
	public char[][] parniveau(int lvl) {
		int code=lvl, j=0;
		char [][] tab= new char[this.y][this.x];
		try {
			final String sql = "{call parniveau(?)}";
			this.open();
			final CallableStatement call = this.connection.prepareCall(sql);
			call.setInt(1, code);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while(resultSet.next()) {
				String lignes=resultSet.getString("lignes");
				
					for(int i=0; i<this.x; i++) {
						tab[j][i]=lignes.charAt(i);
					}
				j++;
			}
			//return helloWorld;
		} catch (final SQLException e) {
			System.out.println("échec");
			e.printStackTrace();
		}
		return tab;
	}

}
