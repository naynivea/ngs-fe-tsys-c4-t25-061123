package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

	@Autowired
	PeliculaService peliculaService;

	@GetMapping("/list")
	public List<Pelicula> listPeliculas() {
		return peliculaService.listPeliculas();
	}

	@GetMapping("/{cod}")
	public Pelicula getPeliculaById(@PathVariable Integer id) {
		return peliculaService.getPeliculaById(id);
	}

	@PostMapping("/add")
	public Pelicula addPelicula(@RequestBody Pelicula pelicula) {
		return peliculaService.savePelicula(pelicula);
	}

	@PutMapping("/{cod}")
	public Pelicula updatePelicula(@RequestBody Pelicula pelicula, @PathVariable Integer id) {
		Pelicula peliculaActualizar = peliculaService.getPeliculaById(id);
		peliculaActualizar.setCalificacionEdad(pelicula.getCalificacionEdad());
		peliculaActualizar.setNombre(pelicula.getNombre());
		return peliculaService.savePelicula(peliculaActualizar);
	}

	@DeleteMapping("/{cod}")
	public void deletePelicula(@PathVariable Integer id) {
		peliculaService.deletePelicula(id);
		System.out.println("¡Película borrada con éxito!");
	}
}