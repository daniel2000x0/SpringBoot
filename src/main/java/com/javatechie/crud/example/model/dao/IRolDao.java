package com.javatechie.crud.example.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.crud.example.model.Users;
import com.javatechie.crud.example.model.reservation;
import com.javatechie.crud.example.model.rol;

public interface IRolDao extends JpaRepository<rol, Long>{
	@Query(value="SELECT * "
			+ "FROM rol r "
			+ "WHERE r.id_rol=?1",nativeQuery=true)
	List<rol> buscarusuario(Long id_rol);
}
