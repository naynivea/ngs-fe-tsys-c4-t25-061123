package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaService {
	public List<Pelicula> listPeliculas();

	public Pelicula getPeliculaById(Integer id);

	public Pelicula savePelicula(Pelicula pelicula);

	public void deletePelicula(Integer id);
}
