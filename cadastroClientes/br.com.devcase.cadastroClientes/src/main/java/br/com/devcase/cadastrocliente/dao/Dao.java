package br.com.devcase.cadastrocliente.dao;

import br.com.devcase.cadastrocliente.domain.Pessoa;

import java.sql.*;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Dao {
	private Connection connection= null;
	//private SimpleDateFormat dateFormatter = null;
	public Dao(){
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:postgresql:pessoas", "postgres", "123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 //dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
	}
	public Pessoa findById(long id) {
		try {
			Statement st = connection.createStatement();
			ResultSet result= st.executeQuery("select * from tabela where tabela.id= id");
			result.next();
			return new Pessoa(result.getLong(1),result.getString(2),result.getString(3));
			}
		 catch (SQLException e) {
			e.printStackTrace();
			}
			return null;
	}
	public ArrayList<Pessoa> getList() {
		try {
			Statement st = connection.createStatement();
			ResultSet result= st.executeQuery("select * from tabela");
			ArrayList<Pessoa> list = new ArrayList<Pessoa>();
			while(result.next()){
				list.add(new Pessoa(result.getLong(1),result.getString(2),result.getString(3)));
			}
			return list;
			}
		 catch (SQLException e) {
			e.printStackTrace();
			}
			return null;
	}
	public void update(Pessoa pessoa) {
		Statement st;
		try {
			st = connection.createStatement();
			try {
				st.executeUpdate("UPDATE table_tabela SET id= " + pessoa.getId() + ", nome=" + pessoa.getNome() + "WHERE id=pessoa.id");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	public void save(Pessoa pessoa) {
		Statement st;
		try {
			st = connection.createStatement();
			try {
				st.executeUpdate("INSERT INTO tabela (nome, dataNascimento)  VALUES ('" + pessoa.getNome() + "', '" + pessoa.getDataNascimento()+ "');");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}
