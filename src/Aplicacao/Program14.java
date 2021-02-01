package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Comentarios;
import Entidades.Post;

public class Program14 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Have a nice trio!");
		Comentarios c2 = new Comentarios("Wow that's awesome!");	
		
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
										"Traveling to new Zeland", 
											"I,m Going", 
												12);
		
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		
		System.out.println(p1);

	}

}
