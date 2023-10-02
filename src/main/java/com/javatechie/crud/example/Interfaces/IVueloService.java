package com.javatechie.crud.example.Interfaces;

import java.util.List;


import com.javatechie.crud.example.model.vuelo;

public interface IVueloService {
	public List<vuelo> findAll();
	public vuelo findById(Long id);
	public vuelo save(vuelo vuelo);
	public void delete(Long id);
}
