package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatechie.crud.example.Interfaces.IRolService;
import com.javatechie.crud.example.model.rol;
import com.javatechie.crud.example.model.dao.IRolDao;

public class serviceRol implements IRolService{
    @Autowired
    private IRolDao  roldao;
	@Override
	public List<rol> findAll() {
		// TODO Auto-generated method stub
		return roldao.findAll();
	}

	@Override
	public rol findById(Long id) {
		// TODO Auto-generated method stub
		return roldao.findById(id).orElse(null);
	}

	@Override
	public rol save(rol rols) {
		// TODO Auto-generated method stub
		return roldao.save(rols);
	}

	@Override
	public void delete(Long id) {
		roldao.deleteById(id);
		
	}

}
