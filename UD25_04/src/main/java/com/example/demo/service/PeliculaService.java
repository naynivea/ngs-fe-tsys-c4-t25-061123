package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaService implements IPeliculaService {

	@Autowired
	IPeliculaDAO peliDAO;

	@Override
	public List<Pelicula> listPeliculas() {
		// TODO Auto-generated method stub
		return peliDAO.findAll();
	}

	@Override
	public Pelicula getPeliculaById(Integer id) {
		// TODO Auto-generated method stub
		return peliDAO.findById(id).get();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return peliDAO.save(pelicula);
	}

	@Override
	public void deletePelicula(Integer id) {
		peliDAO.deleteById(id);

	}

}
