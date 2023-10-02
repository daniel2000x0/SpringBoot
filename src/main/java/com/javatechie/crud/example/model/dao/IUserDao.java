package com.javatechie.crud.example.model.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.crud.example.model.Users;



public interface IUserDao extends JpaRepository<Users, Long> {

	@Query(value="SELECT * "
			+ "FROM users u "
			+ "WHERE u.id_user=?1",nativeQuery=true)
	List<Users> buscarusuario(Long id_user);
	
	
	
}
