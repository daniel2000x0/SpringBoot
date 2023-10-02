package com.javatechie.crud.example.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.crud.example.model.reservatiohotel;
import com.javatechie.crud.example.model.rol;


public interface IReservationHotelDao extends JpaRepository<reservatiohotel, Long>{
	@Query(value="SELECT * "
			+ "FROM rol reservationhotel "
			+ "WHERE r.id_reservationhotel=?1",nativeQuery=true)
	List<reservatiohotel> buscarusuario(Long id_rol);
}
