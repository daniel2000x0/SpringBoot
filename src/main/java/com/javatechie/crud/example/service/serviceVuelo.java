package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatechie.crud.example.Interfaces.IVueloService;
import com.javatechie.crud.example.model.vuelo;
import com.javatechie.crud.example.model.dao.IVueloDao;

public class serviceVuelo implements IVueloService{
@Autowired
 private IVueloDao vuelodao;
	@Override
	public List<vuelo> findAll() {
		// TODO Auto-generated method stub
		return vuelodao.findAll();
	}

	@Override
	public vuelo findById(Long id) {
		// TODO Auto-generated method stub
		return vuelodao.findById(id).orElse(null);
	}

	@Override
	public vuelo save(vuelo vuelo) {
		// TODO Auto-generated method stub
		return vuelodao.save(vuelo);
	}

	@Override
	public void delete(Long id) {
		 vuelodao.deleteById(id);
		
	}

}
