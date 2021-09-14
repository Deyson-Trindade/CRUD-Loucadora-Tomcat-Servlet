package br.com.loucadora.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/locadora?autoReconnect=true&useSSL=false", "root", "123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}