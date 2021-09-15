package br.com.loucadora.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Context initCtx = new InitialContext();
			 

			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			 

			DataSource ds = (DataSource)
			 

			envCtx.lookup("jdbc/MySQLDB");
			return ds.getConnection();
		} catch (SQLException | NamingException e) {
			throw new RuntimeException(e);
		}
	}
}