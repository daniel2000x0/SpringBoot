package com.javatechie.crud.example.Interfaces;

import java.util.List;

import com.javatechie.crud.example.model.Users;



public interface IUsersService {
	public List<Users> findAll();
	public Users findById(Long id);
	public Users save(Users asistencia);
	public void delete(Long id);

}
