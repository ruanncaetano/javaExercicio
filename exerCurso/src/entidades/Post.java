package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	SimpleDateFormat dt= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	private Date data;
	private String titulo;
	private String conteudo;
	private Integer like;
	
	List<Comentarios> comentarios= new ArrayList<>();
	
	// sets e gets
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
	public Integer getLike() {
		return like;
	}
	public void setLike(Integer like) {
		this.like = like;
	}
	
	// construtores
	public Post() {
	}
	
	public Post(Date data, String titulo,String conteudo,Integer like)
	{
		setData(data);
		setTitulo(titulo);
		setConteudo(conteudo);
		setLike(like);
	}
	// para List não faz o set e get deve fazer uma strutura de ADD e REMOVE 
	public void addComentario(Comentarios comentario)
	{
		comentarios.add(comentario);
	}
	public void removeComentario(Comentarios comentario)
	{
		comentarios.remove(comentario);
	}
	
	public String toString()
	{
		StringBuilder sub=new StringBuilder();
		sub.append("Titulo: " + titulo + "\n");
		sub.append(conteudo +"\n");
		sub.append(dt.format(data));
		sub.append(like+"\n");
		sub.append("Comentarios");
		for(Comentarios comt: comentarios)
			sub.append(comt.getComentario());
		return sub.toString(); 
		
	}
	
}
