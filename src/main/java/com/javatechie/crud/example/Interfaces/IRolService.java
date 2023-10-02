package com.javatechie.crud.example.Interfaces;

import java.util.List;

import com.javatechie.crud.example.model.reservation;
import com.javatechie.crud.example.model.rol;

public interface IRolService {
	public List<rol> findAll();
	public rol findById(Long id);
	public rol save(rol rols);
	public void delete(Long id);
}
