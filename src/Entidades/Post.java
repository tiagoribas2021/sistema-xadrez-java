package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentarios> coments = new ArrayList<>();

	public Post() {
	}

	public Post(Date momento, String titulo, String conteudo, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return coments;
	}
	
	public void addComent(Comentarios comentario) {
		coments.add(comentario);
	}
	
	public void removeComent(Comentarios comentario) {
		coments.remove(comentario);
	}

	
	public String toString() {
		

		StringBuilder sd = new StringBuilder();
		
		sd.append(titulo +"\n");
		sd.append(likes);
		sd.append(" Likes - ");	
		sd.append(sdf.format(momento) +"\n");	
		sd.append(conteudo +"\n");
		sd.append("coments :\n");

		for (Comentarios c : coments) {
			sd.append(c.getTexto() +"\n");
		}
		
		return sd.toString();

	}	
	
	
}
