package com.javatechie.crud.example.Interfaces;

import java.util.List;

import com.javatechie.crud.example.model.reservation;
import com.javatechie.crud.example.service.serviceHotel;

public interface IReservationService {
	public List<reservation> findAll();
	public reservation findById(Long id);
	public reservation save(reservation reserva);
	public void delete(Long id);
}
