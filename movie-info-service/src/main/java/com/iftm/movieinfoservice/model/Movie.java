package com.iftm.movieinfoservice.model;

public class Movie {

	private String movieId;
	private String nome;
		
	//AQUI INDICA COMO ESTA CLASSE PODERÁ SER ACESSADA
	public Movie(String movieId, String nome) {
		super();
		this.movieId = movieId;
		this.nome = nome;
	}
	
	//INDICA COMO GERAR UM OBJETO VAZIO DESSA CLASSE QUE DEPOIS SERÁ POPULADO
	public Movie() {super();}
	
	//AQUI TEMOS OS METODOS PARA PEGAR (GET) E SETAR(SET) AS INFORMAÇÕES
	public String getMovieId() {return movieId;}
	public void setMovieId(String movieId) {this.movieId = movieId;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	
	
}
