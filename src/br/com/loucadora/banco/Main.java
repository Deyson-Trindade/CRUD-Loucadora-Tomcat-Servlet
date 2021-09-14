package br.com.loucadora.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		ConnectionFactory conFactory = new ConnectionFactory();
		Connection con  = conFactory.getConnection();
		
		try {
			 PreparedStatement statement = con.prepareStatement("select * from filme");
			 ResultSet rs = statement.executeQuery();
			 
			 while (rs.next()) {
				 String nome = rs.getString("nome");
				 String sinopse = rs.getString("sinopse");
				 
				 System.out.println("o nome do filme é " + nome + " e a sinopse é " + sinopse);
			 }
			 statement.close();
			 con.close();
			
			
		} catch (Exception e) {
			
		} finally {
			con.close();
		}
		

	}
	
	
}