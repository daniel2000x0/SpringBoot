package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.Interfaces.IUsersService;
import com.javatechie.crud.example.model.Users;
import com.javatechie.crud.example.model.dao.IUserDao;
@Service
public class serviceUsers implements IUsersService{

	@Autowired
	private IUserDao userdao;
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}

	@Override
	public Users findById(Long id) {
		// TODO Auto-generated method stub
		return userdao.findById(id).orElse(null);
	}

	@Override
	public Users save(Users user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

	@Override
	public void delete(Long id) {
		userdao.deleteById(id);
		
	}

}
