package com.javatechie.crud.example.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.crud.example.model.Users;
import com.javatechie.crud.example.model.reservation;
import com.javatechie.crud.example.model.vuelo;

public interface IVueloDao extends JpaRepository<vuelo, Long>{
	@Query(value="SELECT * "
			+ "FROM vuelo u "
			+ "WHERE u.id_vuelo=?1",nativeQuery=true)
	List<vuelo> buscarusuario(Long id_vuelo);
		

}
