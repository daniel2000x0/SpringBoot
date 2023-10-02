package com.javatechie.crud.example.model.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import com.javatechie.crud.example.model.reservation;

public interface IReservationDao extends JpaRepository<reservation, Long>{
	
	@Query(value="SELECT * "
			+ "FROM reservation reser "
			
			+ "WHERE reser.id_reservation=?1 ",nativeQuery=true)
	List<reservation> buscarareservation(Long id_reservation);

}
