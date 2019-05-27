package Boulderdash.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DAOconnection {
	static String URL="jdbc:mysql://localhost/javapetri?autoReconnect=true&useSSL=false";
	static String LOGIN="root";
	static String PASSWORD="";
	private java.sql.Connection connection;
	private Statement statement;
	private ResultSet resultat;
	
	public DAOconnection() {
		super();
		// TODO Auto-generated constructor stub
		
			this.connection=null;
			this.statement=null;
		
	}
	public boolean open() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection=DriverManager.getConnection(URL,LOGIN, PASSWORD);
			this.statement=this.connection.createStatement();
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

}
