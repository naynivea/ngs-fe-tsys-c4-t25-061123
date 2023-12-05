package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	private String nombre;
	@Column(name = "calificacionEdad")
	private int calificacionEdad;

	public Pelicula() {

	}

	public Pelicula(int codigo, String nombre, int calificacionEdad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}
	
}
