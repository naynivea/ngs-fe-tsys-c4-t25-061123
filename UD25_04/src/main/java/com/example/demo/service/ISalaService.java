package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Sala;

public interface ISalaService {
	public List<Sala> listSalas();

	public Sala saveSala(Sala sala);

	public Sala getSalaById(Integer id);

	public void deleteSala(Integer id);
}