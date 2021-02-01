package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mmss");
	
	private String nome;
	private String email;
	private Date dtniver;

	public Clientes() {
	
	}

	public Clientes(String nome, String email, Date dtniver) {
		this.nome = nome;
		this.email = email;
		this.dtniver = dtniver;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtniver() {
		return dtniver;
	}

	public void setDtniver(Date dtniver) {
		this.dtniver = dtniver;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente = "+nome+" ");
		sb.append(sdf.format(dtniver)+" - ");
		sb.append(email);	
				
		return sb.toString();
	}
}
