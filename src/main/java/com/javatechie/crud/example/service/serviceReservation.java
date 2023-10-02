package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.Interfaces.IReservationService;
import com.javatechie.crud.example.model.reservation;
import com.javatechie.crud.example.model.dao.IReservationDao;
@Service
public class serviceReservation implements IReservationService {
@Autowired
private IReservationDao reservationdao;
	@Override
	public List<reservation> findAll() {
		// TODO Auto-generated method stub
		return reservationdao.findAll();
	}

	@Override
	public reservation findById(Long id) {
		// TODO Auto-generated method stub
		return reservationdao.findById(id).orElse(null);
	}

	@Override
	public reservation save(reservation reserva) {
		// TODO Auto-generated method stub
		return reservationdao.save(reserva);
	}

	@Override
	public void delete(Long id) {
		reservationdao.deleteById(id);;
		
	}

}
