package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Sala;
import com.example.demo.service.SalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {
	@Autowired
	SalaService salaService;

	@GetMapping("/list")
	public List<Sala> listSalas() {
		return salaService.listSalas();
	}

	@GetMapping("/{cod}")
	public Sala getSalaById(@PathVariable Integer id) {
		return salaService.getSalaById(id);
	}

	@PostMapping("/add")
	public Sala addPelicula(@RequestBody Sala sala) {
		return salaService.saveSala(sala);
	}

	@PutMapping("/{cod}")
	public Sala updateSala(@RequestBody Sala sala, @PathVariable Integer id) {
		Sala salaActualizar = salaService.getSalaById(id);
		salaActualizar.setNombre(sala.getNombre());
		salaActualizar.setPelicula(sala.getPelicula());
		return salaService.saveSala(salaActualizar);
	}

	@DeleteMapping("/{cod}")
	public void deleteSala(@PathVariable Integer id) {
		salaService.deleteSala(id);
		System.out.println("¡Sala borrada con éxito!");
	}
}