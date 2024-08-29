package exerCurso;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Post;
public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat data= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios com1=new Comentarios("Uau que lugar lindo");
		Comentarios com2=new Comentarios("Arrsou em miga");

		Post p1 = new Post(data.parse("10/08/2024 10:50:15"),
				"Viagem pra Praia", "Foto da vista do predio",15);
	}

}
