package fr.alma.middleware1314.services.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseManager {

	private static DatabaseManager instance;
	private Connection con = null;

	/**
	 * Set the Connection
	 * @param con
	 */
	private void setCon(Connection con) {
		this.con = con;
	}

	private DatabaseManager(){
		try {
			Class.forName("org.h2.Driver"); //loads the driver
			setCon(DriverManager.getConnection("jdbc:h2://plop", "root", "root"));

			//creates tables for the database


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createTableUser(){
		String sqlquery = "CREATE TABLE IF NOT EXISTS User"+
				"(userName VARCHAR(2),"
				+ "password VARCHAR(2),"
				+ "PRIMARY KEY(userName));";
		try{
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sqlquery);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
